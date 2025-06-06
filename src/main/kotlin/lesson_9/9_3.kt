package org.example.lesson_9

fun main() {

    val omelette = mutableListOf(2, 50, 15)

    println("Какое количество порций вам необходимо ?")
    val input = readln().toInt()

    val portionsOmelette = omelette.map { it * input }
    val eggs = portionsOmelette[0]
    val milk = portionsOmelette[1]
    val butter = portionsOmelette[2]

    println("На $input порций вам потребуется яиц $eggs шт., молока $milk мл, сливочного масла $butter гр.")

}