package objectOrientation

import java.util.*

val list: List<Int> = listOf(1, 2, 3)

class Timeline<E>{

    private val data2Data: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E){
        data2Data.put(Date(), element)
    }

    fun addAll(elements: Collection<E>){
        elements.forEach { add(it) }
    }

    fun getLatest(): E{
        return data2Data.values.last()
    }

}

fun <E> timelineOf(vararg elements: E) : Timeline<E>{
    val result = Timeline<E>()
    for(element in elements){
        result.add(element)
    }

    return result
}

fun main(args: Array<String>) {
    val timeLine: Timeline<Int> = Timeline()
    timeLine.add(2)
    timeLine.getLatest()

    val timeline2 = timelineOf(1, 2, 3)
}