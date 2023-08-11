package com.example.androidstudioinviroment

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var age = 10
//        age = 20
//        val ag : Byte = 1
//        val name = "Mohammad"
//        Log.d("mohammad", "$name")
//        (-------)
//        val family = "Peyvandian"
//        Log.d("mohammad","$family")
//        (--------)
//        val age = """
//            lsfngong
//            pgnwrngoiwrg
//            wpignoiweg
//        """.trimIndent()
//        Log.d("mohammad","$age")
//        (--------)
//        val Name = "mohammad peyvandian"
//        Log.d("mohammad","$Name")
//        (--------)
//        val age = 65
//        Log.d("mohammad","${age.toChar()}")
//        val esm = 408
//        Log.d("mohammad","${esm.toChar()}")
//        (--------)
//        val variable = " hello world"
//        Log.d("mohammad","${variable.uppercase()}")
//        Log.d("mohammad","${variable.lowercase()}")
//        Log.d("mohammad","${variable.trim()}")
//        Log.d("mohammad","${variable.drop(4)}")
//        (--------)
        val value = 300.6
        Log.d("mohammad","${floor(value)}")
        Log.d("mohammad","${ceil(value)}")
        Log.d("mohammad","${round(value)}")
    }

}
