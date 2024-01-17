package com.example.konversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class Data : AppCompatActivity() {

    private lateinit var editTextData: EditText
    private lateinit var textViewHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        editTextData = findViewById(R.id.editTextData)
        textViewHasil = findViewById(R.id.textViewHasil)

        editTextData.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val inputText = s.toString()
                val bit = inputText.toDoubleOrNull() ?: 0.0
                val byte = bit / 8
                textViewHasil.text = "$bit bit = $byte byte"
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }
}