package org.example.lesson_8

fun main() {

    val ingredients =
        arrayOf("картофель", "курица", "морковь", "лук", "грибы", "сметана", "чеснок", "сыр", "масло", "специи")

    for (i in ingredients) {
        println(i)
    }

    println("\nВведите ингридиент, который вы хотите заменить:")
    val inputIngredientChange = readln()

    if (inputIngredientChange in ingredients) {
        println("Какой ингридиент вы хотите добавить ?")
        val inputIngredientAdd = readln()
        ingredients[ingredients.indexOf(inputIngredientChange)] = inputIngredientAdd

        println("\nГотово! Вы сохранили следующий список:")
        for (i in ingredients) {
            println(i)
        }

    } else {
        println("Данного ингридиента нет в списке")
    }
}