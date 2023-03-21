package com.example.proyecto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Configura el botón de crear cuenta para que abra la actividad de creación de cuenta
        val createAccountButton: Button = findViewById(R.id.create_account_button)
        createAccountButton.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

        // Configura el botón de inicio de sesión para que abra la actividad principal
        val loginButton: Button = findViewById(R.id.in_button)
        loginButton.setOnClickListener {
            // Aquí se debería validar el nombre de usuario y la contraseña antes de abrir la actividad principal
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}

