package com.example.uifragmentsapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.uifragmentsapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ButtonsFragment : Fragment(R.layout.fragment_buttons) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.btnExample)
        val imgBtn = view.findViewById<ImageButton>(R.id.imageButtonExample)
        val fab = view.findViewById<FloatingActionButton>(R.id.fabExample)

        btn.setOnClickListener {
            Toast.makeText(requireContext(), "Button normal presionado ✅", Toast.LENGTH_SHORT).show()
        }

        imgBtn.setOnClickListener {
            Toast.makeText(requireContext(), "ImageButton presionado 📷", Toast.LENGTH_SHORT).show()
        }

        fab.setOnClickListener {
            Toast.makeText(requireContext(), "FAB presionado ➕", Toast.LENGTH_SHORT).show()
        }
    }
}