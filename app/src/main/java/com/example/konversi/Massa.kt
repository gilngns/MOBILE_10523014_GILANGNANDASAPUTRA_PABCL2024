package com.example.konversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class Massa : AppCompatActivity() {

    private lateinit var editTextGram: EditText
    private lateinit var textViewHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_massa)
        editTextGram = findViewById(R.id.editTextGram)
        textViewHasil = findViewById(R.id.textViewHasil)

        editTextGram.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val inputText = s.toString()
                val beratGram = inputText.toDoubleOrNull() ?: 0.0
                val beratKilogram = beratGram / 1000
                textViewHasil.text = "$beratGram gram = $beratKilogram kilogram"
            }

            override fun afterTextChanged(s: Editable?) {}
        })

    }
}