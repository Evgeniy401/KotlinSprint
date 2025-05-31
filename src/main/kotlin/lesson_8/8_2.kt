package org.example.lesson_8

fun main() {

    val ingredients =
        arrayOf("картофель", "курица", "морковь", "лук", "грибы", "сметана", "чеснок", "сыр", "масло", "специи")

    println("Какой ингридиент вы хотите найти ?")
    val searchElement = readln()

    for (ingredient in ingredients) {
        if (ingredient == searchElement) {
            println("Ингредиент $searchElement в рецепте есть!")
            return
        }
    }

    println("Ингредиента $searchElement в рецепте нет.")

}