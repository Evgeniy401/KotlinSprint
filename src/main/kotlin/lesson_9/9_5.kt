package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf<String>()
    for (i in 1..5) {
        while (true) {
            println("Введите ингредиент $i:")
            val input = readln()

            if (input in ingredients) {
                println("Этот ингредиент уже есть в списке, добавьте другой")
            } else {
                ingredients.add(input)
                break
            }
        }
    }

    val formattedIngredients = ingredients.sorted().mapIndexed { index, item ->
        if (index == 0) item.replaceFirstChar { it.uppercase() } else item.lowercase()
    }

    println("Ваш список ингредиентов: ${formattedIngredients.joinToString()}")
}

