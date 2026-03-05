package com.example.uifragmentsapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.uifragmentsapp.R

class TextFieldsFragment : Fragment(R.layout.fragment_text_fields) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etNombre = view.findViewById<EditText>(R.id.etNombre)
        val etCorreo = view.findViewById<EditText>(R.id.etCorreo)
        val btn = view.findViewById<Button>(R.id.btnMostrar)
        val tv = view.findViewById<TextView>(R.id.tvResultado)

        btn.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val correo = etCorreo.text.toString().trim()

            if (nombre.isEmpty() || correo.isEmpty()) {
                Toast.makeText(requireContext(), "Completa nombre y correo", Toast.LENGTH_SHORT).show()
                tv.text = "Resultado: faltan datos"
                return@setOnClickListener
            }

            tv.text = "Resultado:\nNombre: $nombre\nCorreo: $correo"
            Toast.makeText(requireContext(), "Datos mostrados ✅", Toast.LENGTH_SHORT).show()
        }
    }
}