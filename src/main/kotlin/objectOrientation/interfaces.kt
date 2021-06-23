package objectOrientation

//doesn't have constructor, can't have abstract methods
interface Drivable {
    fun drive() {
        println("Driving (interface)")
    }
}

class Bicycle : Drivable {
    override fun drive() {
        println("Driving bicycle")
    }
}

class Boat : Drivable {
    override fun drive() {
        println("Driving boat")
    }
}

fun main(args: Array<String>){
    val drivable: Drivable = Bicycle()
    drivable.drive()
}