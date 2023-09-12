package com.example.dream

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SaleActivity : AppCompatActivity() {
    private val states = listOf(
        State("Andhra Pradesh", listOf("District A", "District B", "District C")),
        State("Tamil Nadu", listOf("District X", "District Y", "District Z")),
        // Add more states and districts here
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale)
                stateSpinner = findViewById(R.id.stateSpinner)
        districtSpinner = findViewById(R.id.districtSpinner)
        submitButton = findViewById(R.id.submitButton)

        // Create an ArrayAdapter for the stateSpinner
        val stateAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, states.map { it.name })
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        stateSpinner.adapter = stateAdapter

        // Create an empty ArrayAdapter for the districtSpinner
        val districtAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, emptyList<String>())
        districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        districtSpinner.adapter = districtAdapter

        // Set a listener for the stateSpinner
        stateSpinner.setOnItemSelectedListener { _, _, position, _ ->
            val selectedState = states[position]
            val selectedDistricts = selectedState.districts
            updateDistrictSpinner(selectedDistricts)
        }

        submitButton.setOnClickListener {
            val selectedState = stateSpinner.selectedItem.toString()
            val selectedDistrict = districtSpinner.selectedItem.toString()
            // Handle the submission logic here
        }

    }
    private fun updateDistrictSpinner(districts: List<String>) {
        val districtAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, districts)
        districtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        districtSpinner.adapter = districtAdapter
    }
}