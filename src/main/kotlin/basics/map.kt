package map

fun main(args: Array<String>){

    val list = (1..100).toList()

    val doubled = list.map { element -> element * 2 }
    list.map { it * 2}

    val average = list.average()
    val shifted = list.map { it - average }

    println(doubled)
    println(shifted)


    //flatmap
    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    val notFlattened = nestedList.map { it.sortedDescending() }

    val flattened = nestedList.flatMap { it.sortedDescending() }

    println(notFlattened)
    println(flattened)

}