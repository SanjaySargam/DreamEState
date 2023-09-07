package com.example.dream


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SaleActivity : AppCompatActivity() {

    private lateinit var propertyNameEditText: EditText
    private lateinit var aadharCardEditText: EditText
    private lateinit var propertyPriceEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale)

        propertyNameEditText = findViewById(R.id.editTextPropertyName)
        aadharCardEditText = findViewById(R.id.editTextAadhaarCard)
        propertyPriceEditText = findViewById(R.id.editTextPropertyPrice)
    }

    // Function to handle the "Post Sale" button click
    fun onPostSaleClick(view: View) {
        val propertyName = propertyNameEditText.text.toString()
        val propertyPrice = propertyPriceEditText.text.toString()
        val aadharCard=aadharCardEditText.toString()

        // Perform validation and post the sale (e.g., save to a database)
        if (propertyName.isNotEmpty() && propertyPrice.isNotEmpty()) {
            // Add your logic to post the sale here
            // For example, save the data to a database or send it to a server
            // You can display a success message or navigate to another screen
            Toast.makeText(this, "Sale posted successfully", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
        }
    }
}