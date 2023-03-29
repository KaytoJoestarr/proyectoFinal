package com.example.proyecto_final

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MenuActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_menu)

            val btn1 = findViewById<Button>(R.id.mis_tareas_button)
            btn1.setOnClickListener {
                Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show()
            }

            val btn2 = findViewById<Button>(R.id.hogar_button)
            btn2.setOnClickListener {
<<<<<<< Updated upstream
                Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show()
=======
                val intent = Intent(this, IntegrantesActivity::class.java)
                startActivity(intent)
>>>>>>> Stashed changes
            }

            val btn3 = findViewById<Button>(R.id.habitacion_button)
            btn3.setOnClickListener {
                Toast.makeText(this, "Option 3 selected", Toast.LENGTH_SHORT).show()
            }

            val btn4 = findViewById<Button>(R.id.notas_button)
            btn4.setOnClickListener {
                Toast.makeText(this, "Option 4 selected", Toast.LENGTH_SHORT).show()
            }

            val btn5 = findViewById<Button>(R.id.calendario_button)
            btn5.setOnClickListener {
                Toast.makeText(this, "Option 5 selected", Toast.LENGTH_SHORT).show()
            }

            val btn6 = findViewById<Button>(R.id.puntuacion_button)
            btn6.setOnClickListener {
                Toast.makeText(this, "Option 6 selected", Toast.LENGTH_SHORT).show()
            }

        }
    }



