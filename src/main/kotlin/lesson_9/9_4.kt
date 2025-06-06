package org.example.lesson_9

fun main() {

    println("Введите пять ингредиентов блюда (через запятую с пробелом)")
    val input = readln()
    val ingredients = input.split(", ").toList()

    val sortedList = ingredients.sorted()
    println(sortedList)
}