package com.example.proyecto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configura el botón de cerrar sesión para que cierre la sesión y vuelva a la pantalla de inicio de sesión
        val signOutButton: Button = findViewById(R.id.sign_out_button)
        signOutButton.setOnClickListener {
            // Aquí se debería cerrar la sesión actual del usuario
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
