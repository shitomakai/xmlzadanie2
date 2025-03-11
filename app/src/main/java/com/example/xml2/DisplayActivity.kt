package com.example.xml2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DisplayActivity : AppCompatActivity() {
    private var textViewWelcome: TextView? = null
    private var buttonBack: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        textViewWelcome = findViewById(R.id.textViewWelcome)
        buttonBack = findViewById(R.id.buttonBack)

        val intent = intent
        val name = intent.getStringExtra("USER_NAME")
        val age = intent.getStringExtra("USER_AGE")
        val welcomeMessage = "Welcome, $name. Your age: $age."
        textViewWelcome!!.setText(welcomeMessage)

        buttonBack!!.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}
