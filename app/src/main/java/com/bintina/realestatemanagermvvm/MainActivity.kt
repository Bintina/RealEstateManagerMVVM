package com.bintina.realestatemanagermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bintina.realestatemanagermvvm.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeTextView = findViewById<TextView>(R.id.home_text_view)

        welcomeTextView.text = "Le premier immobilier enregistre vaut 81"
    }
}