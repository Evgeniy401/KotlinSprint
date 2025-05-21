package org.example.lesson_8

fun main() {

    val ingredients =
        arrayOf("картофель", "курица", "морковь", "лук", "грибы", "сметана", "чеснок", "сыр", "масло", "специи")

    println("Какой ингридиент вы хотите найти ?")
    val searchElement = readln()
    var result = false

    for (ingredient in ingredients) {
        if (ingredient == searchElement) {
            result = true
            break
        }
    }

    if (result) {
        println("Ингредиент $searchElement в рецепте есть!")
    } else {
        println("Ингредиента $searchElement в рецепте нет.")
    }
}