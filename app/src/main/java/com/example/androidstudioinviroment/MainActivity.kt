package com.example.androidstudioinviroment

import android.os.Bundle
import android.util.Log
import android.util.Xml
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    //    fun number(a: Int, b: Int): Int {
//        return a + b
//    }
//    fun create(){
//        val sum = number(5 ,8)
//        Log.d("mohammad","sum is = $sum")
//    }
//    (-------)
//    fun string(a: String,b: String){
//        Log.d("mohammad","a is $a, b is $b")
//    }
//    (-------)
//    fun double (a : Double, b :Double): Double {
//        return a + b
//    }
//    (-------)
//    fun num (a:Int,b:Int,c:Double):Double {
//        return a + b + c
//    }
//    fun sum (){
//        val numbers = num(2,5,3.50)
//        Log.d("mohammad","sum is $numbers")
//    }
//    (-------)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val cir = Circle(5)
//        Log.d("mohammad","${cir.print()}")
//        Log.d("mohammad","${Circle.isColor("green")}")
//        (-------)
//        val myCar = Car("bmv","X22",2005,"yellow")
//        Log.d("mohammad","${myCar.brand}")
//        myCar.brand = "bmw"
//        myCar.color = "yellow"
//        myCar.model = "X22"
//        myCar.year =  2005
//        Log.d("mohammad","my model car is ${myCar.model}")
//        (-------)
//        val rect = Mos(20,30)
//        val masahat = rect.masahat()
//        val mohit = rect.mohit()

//        (-------)
//        Log.d("mohammad","${create()}")
//        Log.d("mohammad","${string("hello","world")}")
//        Log.d("mohammad","${double(4.83,29.297)}")
//        Log.d("mohammad","${sum()}")

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
//        val variable = " hello world  "
//        Log.d("mohammad","${variable.uppercase()}")
//        Log.d("mohammad","${variable.lowercase()}")
//        Log.d("mohammad","${variable.trim()}")
//        Log.d("mohammad","${variable.drop(4)}")
//        (--------)
//        val value = 300.6
//        Log.d("mohammad","${floor(value)}")
//        Log.d("mohammad","${ceil(value)}")
//        Log.d("mohammad","${round(value)}")
//        (--------)
//        val js = StringBuilder()
//        Log.d("mohammad","${js.append("875").append("dmc").insert(3,"hello")}")
//        (--------)
//        val str = buildString {
//            append(15)
//            append(678)
//            setCharAt(2, 'h')
//        }
//        Log.d("mohammad", "$str")
//        (--------)
//        var age = 10
//        val result = (age < 15 )
//        Log.d("mohammad","age is $age result is $result")
//        (--------)
//        val result = age / 2
//        Log.d("mohammad","age is $age result is $result")
//        (--------)
//        val dg = (0 until 20 step 5)//downto
//        Log.d("mohammad","$dg")
//        (--------)
//        val ra = (1..30).random()
//        Log.d("mohammad","$ra")
//        (--------)
//        val range = 1..100
//        Log.d("mohammad","${range.contains(200)}")
//        (--------)
//        when(val age = 13) {
//            12 -> Log.d("mohammad","a")
//            in 12..20 -> Log.d("mohammad","b")
//            in 15..30 -> Log.d("mohammad","c")
//            else -> Log.d("mohammad","no match")
//        }
//        (--------)
//        Log.d("mohammad","Enter age :")
//        val age = readLine()
//        Log.d("mohammad","$age")
//        (--------)
//        Log.d("mohammad","Enter age")
//        when(val age = readln().toInt()){
//            10 -> Log.d("mohammad","a --> $age")
//            in 12 until 20 -> {
//                Log.d("mohammad","b --> $age")
//            }
//            in 22..22 -> {
//                Log.d("mohammad","c --> $age")
//
//            }
//            else -> {
//                Log.d("mohammad","No match --> $age")
//            }
//        }
//        (--------)
//        val name = "mohammad"
//        for (i in name.indices){
//            Log.d("mohammad","$i => ${name[i]}")
//        }
//        (--------)
//        for (i in 0..3){
//            for (j in 1..10){
//                if (j == 3 && i == 1){
//                    break
//                }
//                Log.d("mohammad","$i, $j")
//            }
//        }
//        (--------)
//        var a = 20
//        while (a-- > 5){
//            var b = 1
//            while (b++ < 10){
//                Log.d("mohammad","$a , $b")
//            }
//        }
//       (--------)
//        val names = arrayOf("ali","mahdi")
//        for (name in names){
//            Log.d("mohammad","$name")
//        }
//        val emptyArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
//
//        val evenNumbers = emptyArray.filter { item ->
//            item % 2 == 0
//        }
//       for (number in evenNumbers){
//         Log.d("mohammad", number.toString())
//       }
//       (--------)

//        val emptyList = listOf<Int>(1, 2, 3, 4, 5, 6)
//        emptyList.plus(7)
//        for (number in emptyList){
//        Log.d("mohammad", number.toString())
//        }
//       (--------)
//        val emptyListMutable = mutableListOf<Int>(1, 2, 3, 4, 5, 6)
//        emptyListMutable.add(7)
//        for (number in emptyListMutable) {
//            Log.d("mohammad", number.toString())
//        }
//        (--------)
//        emptyList.forEach{element ->
//            emptyListMutable.forEach {item ->
//                Log.d("mohammad", item.toString())
//            }
//        }
//       (--------)
//        val names = arrayOf<String>("mohammad","mahdi","ali","hasan","moein")
//        val Mnames = names.filter { name -> name.endsWith("i") // startwith
//        }
//        Log.d("mohammad","$Mnames")
//        (--------)

//        val names = mutableListOf<String>("mohammad","mahdi","ali","hasan","moein","ho3ein","mohsen")
//        Log.d("mohammad","$names")
//        val newNames = names.filter { it.startsWith("m") }
//            .map { it.lowercase() }
//        Log.d("mohammad","${newNames.joinToString (separator = "--", postfix = "}}")}")//prefix
//        (--------)

//        val map = mutableMapOf<String, Int>()
//        map["mohammad"] = 20
//        map["ali"] = 30
//        Log.d("mohammad","$map")
//
//        for (key in map.keys){
//            Log.d("mohammad","$key")
//        }
//        for (value in map.values) {
//            Log.d("mohammad", "$value")
//        }
//        for (entry in map){
//            Log.d("mohammad","${entry.key}=${entry.value}")
//        }
//        (--------)
//        val a :String = "hello  "
//        val b :Int = 29
//        val c :String? = null
//        Log.d("mohammad","$a")
//        Log.d("mohammad","$b")
//        Log.d("mohammad","${c.plus("98")}")
//        if (b == 25)
//            Log.d("mohammad","$b")
//        else Log.d("mohammad","false")
//        (--------)

//        val a = 50
//        val b = 40
//        if ((a > b || b < a) && (a != 80)
//        ) {
//            Log.d("mohammad","true")
//        }else{
//            Log.d("mohammad","false")
//        }
//        (--------)
//        val day = 1
//        when (day){
//            1 -> Log.d("mohammad","Saturday")
//            2 -> Log.d("mohammad","Sunday")
//            3 -> Log.d("mohammad","Monday")
//            4 -> Log.d("mohammad","Tuesday")
//            5 -> Log.d("mohammad","Wednesday")
//            6 -> Log.d("mohammad","Thursday")
//            7 -> Log.d("mohammad","Friday")
//            else -> Log.d("mohammad","Unknown")
//        }
//        (--------)
//        val score = 65
//        val result = when {
//            score > 90 -> "Excellent"
//            score > 80 -> "Very good"
//            score > 70 -> "Good"
//            score > 60 -> "Not bad"
//            score > 50 -> "Needs improvement"
//            else -> "Bad"
//        }
//        Log.d("mohammad","result : $result ")
//        (--------)

//        var index = 1
//        while (index <= 10){
//            Log.d("mohammad","Number : $index")
//            index ++
//        }
//        Log.d("mohammad","While Finished")

//        var index2 = 10
//        do {
//            Log.d("mohammad","number : $index2")
//            index2--
//        }while (index2 >= 1)
//        Log.d("mohammad","Do While Finished")
//        (--------)

    }
}
