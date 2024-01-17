package com.example.konversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class Jarak : AppCompatActivity() {

    private lateinit var editTextJarak: EditText
    private lateinit var textViewHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jarak)

        editTextJarak = findViewById(R.id.editTextJarak)
        textViewHasil = findViewById(R.id.textViewHasil)

        editTextJarak.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start:Int, before:Int, count:Int) {
                val inputText = s.toString()
                val kilometer = inputText.toDoubleOrNull() ?:0.0
                val meter = kilometer * 1000
                textViewHasil.text = "$kilometer kilometer = $meter meter"
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }
}