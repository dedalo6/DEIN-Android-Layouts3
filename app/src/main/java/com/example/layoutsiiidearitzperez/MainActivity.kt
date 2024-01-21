package com.example.layoutsiiidearitzperez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.table_layout)

        val botonTable:Button = findViewById(R.id.botonTable)

        botonTable.setOnClickListener {
            val miIntent = Intent(this,
                Main2Activity::class.java,
            )
            startActivity(miIntent)
        }

    }
}