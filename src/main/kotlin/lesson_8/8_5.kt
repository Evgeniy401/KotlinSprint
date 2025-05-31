package org.example.lesson_8

fun main() {

    println("Введите необходимое количество ингредиентов:")
    val sizeIngredients = readln().toInt()

    val ingredients = Array(sizeIngredients) { "" }

    for (i in ingredients.indices) {
        println("Введите ингредиент ${i + 1}:")
        ingredients[i] = readln()
    }

    println("\nВаш список:")
    println(ingredients.joinToString(", "))
}