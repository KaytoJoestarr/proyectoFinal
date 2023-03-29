package com.example.proyecto_final

<<<<<<< Updated upstream
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
=======
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
>>>>>>> Stashed changes

class AgregarMascotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_mascota)
<<<<<<< Updated upstream
=======


        val botonContinuar: Button = findViewById(R.id.botonContinuar)
        botonContinuar.setOnClickListener {
            val intent = Intent(this, IntegrantesActivity::class.java)
            startActivity(intent)
        }

        val botonBack: ImageView = findViewById(R.id.backButton)
        botonContinuar.setOnClickListener {
            val intent = Intent(this, IntegrantesActivity::class.java)
            startActivity(intent)
        }

>>>>>>> Stashed changes
    }
}