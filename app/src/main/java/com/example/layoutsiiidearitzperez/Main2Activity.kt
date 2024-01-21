package com.example.layoutsiiidearitzperez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grid_layout)

        val botonGrid: Button = findViewById(R.id.botonGrid)

        botonGrid.setOnClickListener {
            val miIntent = Intent(this,
                MainActivity::class.java,
                )
            startActivity(miIntent)
        }
    }
}