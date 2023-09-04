package com.example.androidstudioinviroment.data

class Rectangle( width : Int, height : Int):Polygan(width,height) {

    fun Area():Int {
        return height * width
    }
    fun Environment():Int {
        return 2 * height + 2 * width
    }

}