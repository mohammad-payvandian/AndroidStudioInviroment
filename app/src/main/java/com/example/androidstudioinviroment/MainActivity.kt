package com.example.androidstudioinviroment

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var age = 10
        age = 20
        val ag : Byte = 1
        val name = "hello world"
        println(name)
    }
}
