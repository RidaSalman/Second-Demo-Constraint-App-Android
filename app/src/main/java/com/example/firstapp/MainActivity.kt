package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Hooks
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        //btn  click
        button.setOnClickListener {
            textView.text = "Button Clicked"
            // Add any additional code to be executed when the button is clicked
        }

        }
    }
