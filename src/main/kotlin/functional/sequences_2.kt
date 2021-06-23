package basics

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val veryLongList = (1..999999L).toList()

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
        sum = veryLongList
            .filter { it > 50 }
            .take(1000)
            .sumOf { it * 2 }
    }

    val msLazy = measureTimeMillis {
        lazySum = veryLongList
            .asSequence()
            .filter { it > 50 }
            .take(1000)
            .map { it * 2 }
            .sum()
    }

    println("Non lazy took $msNonLazy miliseconds and lazy took $msLazy millisecons")

    println(sum)

}