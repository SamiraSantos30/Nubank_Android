package com.example.avaliacao

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var bt_nubankLogo: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        bt_nubankLogo = findViewById(R.id.nubankLogo)

        bt_nubankLogo.setOnClickListener{
            val intent = Intent (this, nubank_drawable::class.java)
            startActivity(intent)

        }
    }
}