package com.example.proyecto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class TareasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tareas)

        val btn1 = findViewById<Button>(R.id.boton_tarea)
        btn1.setOnClickListener {
            val intent = Intent(this, DetalleTareaActivity::class.java)
            Toast.makeText(this, "Detalle Tarea selected", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }

        val btn2 = findViewById<Button>(R.id.boton_tarea2)
        btn2.setOnClickListener {
            val intent = Intent(this, DetalleTareaActivity::class.java)
            Toast.makeText(this, "Detalle Tarea selected", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }

        val btn3 = findViewById<Button>(R.id.boton_tarea3)
        btn3.setOnClickListener {
            val intent = Intent(this, DetalleTareaActivity::class.java)
            Toast.makeText(this, "Detalle Tarea selected", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }

        val btn4 = findViewById<Button>(R.id.button_add)
        btn4.setOnClickListener {
            val intent = Intent(this, CreateTareaActivity::class.java)
            Toast.makeText(this, "Agregar selected", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }

    }

}
