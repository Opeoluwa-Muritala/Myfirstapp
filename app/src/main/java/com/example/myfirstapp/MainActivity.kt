package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvMyTextView = findViewById<TextView>(R.id.textView)
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        var timesClicked = 0

        btnClickMe.setOnClickListener {
            btnClickMe.text = "Don't Click Me"
            timesClicked += 1

            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "You just Clicked Me",Toast.LENGTH_LONG).show()
        }
}
}
