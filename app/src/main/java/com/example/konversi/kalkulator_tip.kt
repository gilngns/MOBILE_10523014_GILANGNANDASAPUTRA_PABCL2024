package com.example.konversi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class kalkulator_tip : AppCompatActivity() {

    private lateinit var editJumlahTagihan: EditText
    private lateinit var editPersentaseTip: EditText
    private lateinit var textHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator_tip)

        editJumlahTagihan = findViewById(R.id.editJumlahTagihan)
        editPersentaseTip = findViewById(R.id.editPersentaseTip)
        textHasil = findViewById(R.id.textHasil)


        editJumlahTagihan.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                hitungTip()
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        editPersentaseTip.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                hitungTip()
            }

            override fun afterTextChanged(s: Editable?) {}
        })

    }

    private fun hitungTip() {
        val jumlahTagihanStr = editJumlahTagihan.text.toString()
        val persentaseTipStr = editPersentaseTip.text.toString()

        if (jumlahTagihanStr.isNotEmpty() && persentaseTipStr.isNotEmpty()) {
            val jumlahTagihan = jumlahTagihanStr.toDoubleOrNull()
            val persentaseTip = persentaseTipStr.toDoubleOrNull()

            if (jumlahTagihan != null && persentaseTip != null) {
                val tip = (jumlahTagihan * persentaseTip) / 100
                val totalTagihan = jumlahTagihan + tip

                val hasil = "Tip: $tip\nTotal Tagihan: $totalTagihan"
                textHasil.text = hasil
            }
        } else {
            textHasil.text = ""
        }
    }
}
