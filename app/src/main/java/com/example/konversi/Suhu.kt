package com.example.konversi

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Suhu : AppCompatActivity() {
    private lateinit var celsiusEditText: EditText
    private lateinit var fahrenheitTextView: TextView
    private lateinit var reamurTextView: TextView
    private lateinit var kelvinTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suhu)

        celsiusEditText = findViewById(R.id.celsiusEditText)
        fahrenheitTextView = findViewById(R.id.fahrenheitTextView)
        reamurTextView = findViewById(R.id.reamurTextView)
        kelvinTextView = findViewById(R.id.kelvinTextView)

        celsiusEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!s.isNullOrEmpty()) {
                    val celsius = s.toString().toDouble()

                    // Konversi ke Fahrenheit
                    val fahrenheit = (celsius * 9 / 5) + 32
                    fahrenheitTextView.text = "Fahrenheit: $fahrenheit"

                    // Konversi ke Reamur
                    val reamur = (4.0 / 5.0) * celsius
                    reamurTextView.text = "Reamur: $reamur"

                    // Konversi ke Kelvin
                    val kelvin = celsius + 273.15
                    kelvinTextView.text = "Kelvin: $kelvin"
                } else {
                    fahrenheitTextView.text = "Fahrenheit:"
                    reamurTextView.text = "Reamur:"
                    kelvinTextView.text = "Kelvin:"
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })


    }
}