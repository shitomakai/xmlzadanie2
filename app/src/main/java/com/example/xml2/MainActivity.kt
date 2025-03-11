package com.example.xml2


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var editTextName: EditText? = null
    private var editTextAge: EditText? = null
    private var buttonContinue: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById<EditText>(R.id.editTextName)
        editTextAge = findViewById<EditText>(R.id.editTextAge)
        buttonContinue = findViewById<Button>(R.id.buttonContinue)

        buttonContinue!!.setOnClickListener(View.OnClickListener {
            val name = editTextName!!.getText().toString()
            val age = editTextAge!!.getText().toString()

            val intent = Intent(
                this@MainActivity,
                DisplayActivity::class.java
            )
            intent.putExtra("USER_NAME", name)
            intent.putExtra("USER_AGE", age)
            startActivity(intent)
        })
    }
}