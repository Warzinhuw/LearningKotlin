package basics

import java.io.FileReader

fun main(args: Array<String>){

    //this way it closes automatically
    FileReader("mayexist.txt").use {
        val str = it.readText()
        println(str)
    }

}