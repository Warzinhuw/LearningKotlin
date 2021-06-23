package objectOrientation

class City {

    var name: String = ""
        get() = field
        set(value) {
            if(value.isNotBlank()){
                field = value
            }
            else{
                field = "Blank city"
            }
        }
    var population: Int = 0

}

fun main(args: Array<String>){
    val berlin = City()
    berlin.name = "Berlin"
    berlin.name = "  "
    berlin.population = 3_500_000

    println(berlin.name)
    println(berlin.population)
}