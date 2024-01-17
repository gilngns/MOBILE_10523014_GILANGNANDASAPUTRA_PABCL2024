package com.example.konversi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

private lateinit var fitur1: CardView
private lateinit var fitur2: CardView
private lateinit var fitur3: CardView
private lateinit var fitur4: CardView
private lateinit var fitur5: CardView
private lateinit var fitur6: CardView
private lateinit var kalkulatorTip: CardView



class MainActivity : AppCompatActivity() {
    private fun initComponents(){
        fitur1 = findViewById(R.id.fitur1)
        fitur2 = findViewById(R.id.fitur2)
        fitur3 = findViewById(R.id.fitur3)
        fitur4 = findViewById(R.id.fitur4)
        fitur5 = findViewById(R.id.fitur5)
        fitur6 = findViewById(R.id.fitur6)
        kalkulatorTip = findViewById(R.id.fiturtip)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()

        fitur1.setOnClickListener({
            val intent = Intent(this, Massa::class.java  )
            startActivity(intent)
        })

        fitur2.setOnClickListener({
            val intent = Intent(this, Suhu::class.java  )
            startActivity(intent)
        })

        fitur3.setOnClickListener({
            val intent = Intent(this, Energi::class.java  )
            startActivity(intent)
        })

        fitur4.setOnClickListener({
            val intent = Intent(this, Panjang::class.java  )
            startActivity(intent)
        })

        fitur5.setOnClickListener({
            val intent = Intent(this, Data::class.java  )
            startActivity(intent)
        })

        fitur6.setOnClickListener({
            val intent = Intent(this, Jarak::class.java  )
            startActivity(intent)
        })

        kalkulatorTip.setOnClickListener({
            val intent = Intent(this, kalkulator_tip::class.java)
            startActivity(intent)
        })
    }
}