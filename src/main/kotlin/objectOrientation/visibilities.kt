package objectOrientation

// private - same as in Java
// protected - same as in Java
// internal - visible inside the same module
// public - same as in Java (default)

private val i = 42
fun a() = 17

private class Car(val brand: String, private val model: String){

    fun tellMeYourModel() = model
}

fun main(args: Array<String>){
    val car = Car("BRAND", "MODEL")
    car.brand
    println(i)
}