package objectOrientation

import kotlin.math.pow

abstract class Shape(val name: String){

    abstract fun area(): Double
}

class Circle(name: String, val radius: Double): Shape(name){

    override fun area(): Double = Math.PI * radius.pow(2.0)
}

fun main(args: Array<String>){
    val shape = Circle("Large circle", 17.0)
    println(shape.area())
}