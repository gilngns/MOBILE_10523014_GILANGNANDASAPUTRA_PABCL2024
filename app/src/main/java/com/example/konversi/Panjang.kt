package com.example.konversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class Panjang : AppCompatActivity() {

    private lateinit var editTextCm : EditText
    private lateinit var textViewHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panjang)

        editTextCm = findViewById(R.id.editTextCm)
        textViewHasil = findViewById(R.id.textViewHasil)

        editTextCm.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start:Int, Count:Int, after:Int) {}

            override fun onTextChanged(s: CharSequence?, start:Int,before:Int,count:Int ) {
                val inputText = s.toString()
                val cm = inputText.toDoubleOrNull() ?: 0.0
                val m = cm / 100
                textViewHasil.text = "$cm cm = $m m"
            }

            override fun afterTextChanged(s: Editable?) {}
        })


    }
}