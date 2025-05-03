package com.example.avaliacao

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class quarta_tela : AppCompatActivity() {

    lateinit var btFulana: ImageButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quarta_tela)

        btFulana = findViewById(R.id.Fulana)

        btFulana.setOnClickListener {
            val intent = Intent(this,quinta_tela::class.java)
            startActivity(intent)
        }
    }
}
