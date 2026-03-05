package com.example.uifragmentsapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.uifragmentsapp.R

class InfoElementsFragment : Fragment(R.layout.fragment_info_elements) {

    private var value = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val progress = view.findViewById<ProgressBar>(R.id.progressExample)
        val btn = view.findViewById<Button>(R.id.btnProgreso)
        val tv = view.findViewById<TextView>(R.id.tvEstado)

        btn.setOnClickListener {
            value = (value + 10).coerceAtMost(100)
            progress.progress = value
            tv.text = "Estado: $value%"
        }
    }
}