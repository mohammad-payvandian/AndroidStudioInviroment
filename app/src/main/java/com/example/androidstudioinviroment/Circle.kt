package com.example.androidstudioinviroment

import android.util.Log

class Circle(val r : Int) {
    fun masahat(): Double{
        return r * r * pi
    }
    fun mohit():Double{
        return 2 * r * pi
    }
    fun print() {
        Log.d("mohammad","r = $r")
        Log.d("mohammad", "mohit = ${mohit()}")
        Log.d("mohammad", "masahat = ${masahat()}")
    }
    companion object{
        const val pi = 3.14
        fun isColor(color :String):Boolean{
            return when(color){
                "black" -> true
                "yellow" -> true
                "red" -> true
                else -> false
            }

        }
    }
}