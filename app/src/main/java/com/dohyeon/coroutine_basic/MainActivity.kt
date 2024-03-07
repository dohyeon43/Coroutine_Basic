package com.dohyeon.coroutine_basic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private val viewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnClick = findViewById<TextView>(R.id.btn_click)

        btnClick.setOnClickListener {
            viewModel.main()
        }
    }
}