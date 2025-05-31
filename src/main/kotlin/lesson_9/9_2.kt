package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("картофель", "курица", "морковь")
    val positiveAnswer = "да"

    println("В рецепте есть базовые ингредиенты:")
    println(ingredients.joinToString(", "))

    println("Желаете добавить свои ингридиенты ?")
    val inputAnswer = readln()

    if (inputAnswer.equals(positiveAnswer, ignoreCase = true)) {
        println("Какой ингридиент вы хотите добавить ?")
        val ingredientsInput = readln()
        ingredients.add(0, ingredientsInput)
    } else {return}

    println("Теперь в рецепте есть следующие ингредиенты:")
    println(ingredients.joinToString(", "))
}