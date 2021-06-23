package objectOrientation

import java.util.*

fun Bicycle.replaceWheel(){
    println("Replacing wheel...")
}

fun Boat.starEngine(): Boolean {
    println("Starting engine...")
    return true
}

fun main(args: Array<String>) {

    val vehicle: Drivable = Bicycle()

    vehicle.drive()

    // instanceof <-> is
    if(vehicle is Bicycle){
        vehicle.replaceWheel()
    }
    else if (vehicle is Boat){
        vehicle.starEngine()
    }

    if(vehicle is Boat && vehicle.starEngine()){
        //...
    }

    if(vehicle !is Boat || vehicle.starEngine()){
        //...
    }

    if(vehicle !is Bicycle){
        return
    }

    vehicle.replaceWheel()

}