package com.example.uifragmentsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.uifragmentsapp.fragments.*

class MainActivity : AppCompatActivity() {

    private fun setFrag(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)

        // Pantalla inicial
        if (savedInstanceState == null) {
            bottomNav.selectedItemId = R.id.nav_textfields
            setFrag(TextFieldsFragment())
        }

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_textfields -> setFrag(TextFieldsFragment())
                R.id.nav_buttons -> setFrag(ButtonsFragment())
                R.id.nav_selection -> setFrag(SelectionFragment())
                R.id.nav_list -> setFrag(ListFragment())
                R.id.nav_info -> setFrag(InfoElementsFragment())
            }
            true
        }
    }
}