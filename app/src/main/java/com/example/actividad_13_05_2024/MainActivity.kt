package com.example.actividad_13_05_2024

import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var calendarView: CalendarView
    private lateinit var selectedDateTextView: TextView
    private lateinit var textArea: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarView = findViewById(R.id.calendarView)
        selectedDateTextView = findViewById(R.id.selectedDateTextView)
        textArea = findViewById(R.id.selectedDateTextView)

        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val selectedDate = "Fecha seleccionada: $dayOfMonth/${month + 1}/$year"
            selectedDateTextView.text = selectedDate
        }
    }

    fun mostrarFechaEnTextArea() {
        val selectedDate = selectedDateTextView.text.toString()
        textArea.text = selectedDate
    }
}
