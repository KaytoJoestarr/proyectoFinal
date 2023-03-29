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

class IntegrantesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_integrantes)
<<<<<<< Updated upstream
    }
}
=======


        val botonEditar: Button = findViewById(R.id.botonEditar)
        botonEditar.setOnClickListener {
            val intent = Intent(this, CreatePerfilActivity::class.java)
            startActivity(intent)
        }


        val addMascota: ImageView = findViewById(R.id.mascotaAddBoton)
        addMascota.setOnClickListener {
            val intent = Intent(this, AgregarMascotaActivity::class.java)
            startActivity(intent)
        }
    }

}

>>>>>>> Stashed changes
