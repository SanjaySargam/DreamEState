package com.example.dream

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PropertyBuyActivity : AppCompatActivity() {
    private lateinit var searchCriteriaEditText: EditText
    private lateinit var searchPropertiesButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        // Initialize UI elements
        searchCriteriaEditText = findViewById(R.id.editTextSearchCriteria)
        searchPropertiesButton = findViewById(R.id.buttonSearchProperties)

        // Set a click listener for the "Search Properties" button
        searchPropertiesButton.setOnClickListener {
            val searchCriteria = searchCriteriaEditText.text.toString()

            // Perform property search based on search criteria
            // For this example, we'll just show a toast message
            Toast.makeText(this, "Searching properties with criteria: $searchCriteria", Toast.LENGTH_SHORT).show()
        }
    }
}
