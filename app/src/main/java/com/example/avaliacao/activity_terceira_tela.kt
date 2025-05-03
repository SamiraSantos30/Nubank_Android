package com.example.avaliacao

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_terceira_tela : AppCompatActivity() {

    lateinit var btValor: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_terceira_tela)

        btValor = findViewById(R.id.valor)

       btValor.setOnClickListener{
           val intent = Intent(this,quarta_tela::class.java)
           startActivity(intent)
        }
    }
}