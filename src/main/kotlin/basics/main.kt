package basics

import kotlin.random.Random

fun main(args: Array<String>){
    print("Digite um nome: ");
    val nome: String? = readLine()
    val nomeFinal = if(nome.isNullOrBlank()) "Default value" else nome
    if(!nome.isNullOrBlank())
        println("Welcome, $nomeFinal!")
    else
        println("Was null")
    val ints = mutableListOf<Int>()
    for (i in 1..100){
        ints.add(Random.nextInt(1, 100))
    }

    var index = 0
    while (ints[index] > 10 && index < ints.size){
        println("[$index]: ${ints[index]}")
        index++
    }
    println("Final: [$index]: ${ints[index]}")

}