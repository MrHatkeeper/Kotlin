package zelenina2

import java.util.Scanner

fun main(){
    val input = mutableMapOf<String, String?>()
    val sc = Scanner(System.`in`)


    println("Kolik věcí")
    var count = sc.nextLine().toInt()
    for (i in 0 until count) {
        println("Přidat zeleninu")
        val word = sc.nextLine()
        if (input[word] != null) {
            println("už tam jendou je")
            count++
        } else input[word] = "zelenina"
    }

    println("Kolik věcí")
    count = sc.nextLine().toInt()
    for (i in 0 until count) {
        println("Přidat ovoce")
        val word = sc.nextLine()
        if (input[word] != null) {
            println("už tam jendou je")
        } else input[word] = "ovoce"
    }

    while (true) {
        println("Co hledáš")
        val word = sc.nextLine()
        if (word == "END") break
        if (input[word] == null) {
            println("ostatní")
        } else println(input[word])
    }
}
