package com.example.proyecto_final

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MenuActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_menu)

            val btn1 = findViewById<ImageButton>(R.id.mis_tareas_button)

                btn1.setOnClickListener {
                    val intent = Intent(this, TareasActivity::class.java)
                    Toast.makeText(this, "Mis Tareas selected", Toast.LENGTH_SHORT).show()
                    startActivity(intent)

            }

            val btn2 = findViewById<ImageButton>(R.id.hogar_button)
            btn2.setOnClickListener {
                Toast.makeText(this, "Mi Hogar selected", Toast.LENGTH_SHORT).show()
            }

            val btn3 = findViewById<ImageButton>(R.id.habitacion_button)
            btn3.setOnClickListener {
                Toast.makeText(this, "Mi Habitación selected", Toast.LENGTH_SHORT).show()
            }


            val btn4 = findViewById<ImageButton>(R.id.notas_button)
            btn4.setOnClickListener {
                Toast.makeText(this, "Mis Notas selected", Toast.LENGTH_SHORT).show()
            }

            val btn5 = findViewById<ImageButton>(R.id.calendario_button)
            btn5.setOnClickListener {
                Toast.makeText(this, "Calendario selected", Toast.LENGTH_SHORT).show()
            }

            val btn6 = findViewById<ImageButton>(R.id.puntuacion_button)
            btn6.setOnClickListener {
                Toast.makeText(this, "Puntuación 6 selected", Toast.LENGTH_SHORT).show()
            }


    }

}








