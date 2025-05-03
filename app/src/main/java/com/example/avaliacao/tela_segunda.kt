package com.example.avaliacao

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tela_segunda : AppCompatActivity() {

    lateinit var btTransferencia: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_segunda)

        btTransferencia = findViewById(R.id.transferir)

        btTransferencia.setOnClickListener{
            val intent = Intent(this,activity_terceira_tela::class.java)
            startActivity(intent)
        }
    }
}