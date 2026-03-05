package com.example.uifragmentsapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uifragmentsapp.R
import com.example.uifragmentsapp.adapter.SimpleItemAdapter
import com.example.uifragmentsapp.model.SimpleItem

class ListFragment : Fragment(R.layout.fragment_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.recyclerExample)

        val items = listOf(
            SimpleItem("Elemento 1", "Ejemplo de lista para mostrar información."),
            SimpleItem("Elemento 2", "RecyclerView recicla vistas para rendimiento."),
            SimpleItem("Elemento 3", "Ideal para catálogos y listas largas."),
            SimpleItem("Elemento 4", "Da clic para mostrar un Toast.")
        )

        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = SimpleItemAdapter(items) { item ->
            Toast.makeText(requireContext(), "Seleccionaste: ${item.title}", Toast.LENGTH_SHORT).show()
        }
    }
}