package com.example.newapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.newapp.MainActivity2
import com.example.newapp.R

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        // Referenciando o botão
        val button = findViewById<Button>(R.id.button5)

        // Configurando o evento de clique do botão
        button.setOnClickListener {
            // Inicia a proxima
            val intent = Intent(this@MainActivity4,MainActivity5::class.java)
            startActivity(intent)
        }
    }
}
