package com.example.uifragmentsapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.uifragmentsapp.R

class SelectionFragment : Fragment(R.layout.fragment_selection) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cb = view.findViewById<CheckBox>(R.id.checkBox1)
        val rg = view.findViewById<RadioGroup>(R.id.radioGroupExample)
        val sw = view.findViewById<Switch>(R.id.switchExample)
        val btn = view.findViewById<Button>(R.id.btnResumen)
        val tv = view.findViewById<TextView>(R.id.tvResumen)

        btn.setOnClickListener {
            val check = if (cb.isChecked) "CheckBox: activado" else "CheckBox: desactivado"

            val radio = when (rg.checkedRadioButtonId) {
                R.id.radio1 -> "Radio: opción 1"
                R.id.radio2 -> "Radio: opción 2"
                else -> "Radio: no seleccionado"
            }

            val swText = if (sw.isChecked) "Switch: activado" else "Switch: desactivado"

            tv.text = "Resumen:\n$check\n$radio\n$swText"
        }
    }
}