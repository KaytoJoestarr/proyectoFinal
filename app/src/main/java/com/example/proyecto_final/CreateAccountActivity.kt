package com.example.proyecto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        // Configura el botón de crear cuenta para que guarde la cuenta y abra la actividad principal
        val createAccountButton: Button = findViewById(R.id.create_account_button)
        createAccountButton.setOnClickListener {
            // Aquí se debería validar los datos de la cuenta antes de guardarla
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}