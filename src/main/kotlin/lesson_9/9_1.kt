package org.example.lesson_9

fun main() {

    val ingredients = listOf("картофель", "курица", "морковь", "лук", "грибы", "сметана", "чеснок", "сыр", "масло", "специи")

    println("В рецепте есть следующие ингредиенты:\n")
    println(ingredients.joinToString("\n"))

}