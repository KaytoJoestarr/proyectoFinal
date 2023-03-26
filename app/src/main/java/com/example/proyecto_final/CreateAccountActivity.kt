package com.example.proyecto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        // Botón Crear
        val createAccountButton: Button = findViewById(R.id.create_account_button)
        createAccountButton.setOnClickListener {
            // Aquí se debería validar los datos de la cuenta antes de guardarla
            val intent = Intent(this, CreatePerfilActivity::class.java)
            startActivity(intent)
            finish()
        }

        //Botón Atras
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}