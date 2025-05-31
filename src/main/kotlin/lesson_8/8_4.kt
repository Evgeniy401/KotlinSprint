package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("картофель", "курица", "морковь", "лук", "грибы", "сметана", "чеснок", "сыр", "масло", "специи")

    println(ingredients.joinToString(", "))

    println("\nВведите ингредиент, который вы хотите заменить:")
    val inputIngredientChange = readln()

    val index = ingredients.indexOf(inputIngredientChange)
    if (index != -1) {
        println("Какой ингредиент вы хотите добавить?")
        val inputIngredientAdd = readln()
        ingredients[index] = inputIngredientAdd

        println("\nГотово! Вы сохранили следующий список:")
        println(ingredients.joinToString(", "))
    } else {
        println("Данного ингредиента нет в списке")
    }
}