package org.example.lesson_11

fun main() {
    val burger1 = Recipe(
        1,
        "Бургер с грибами и сыром",
        listOf("творог", "куртное яйцо", "пшеничная мука", "подсолнечное масло", "сахар"),
        RecipeCategory.BURGERS
    )
}

class Recipe(
    id: Int,
    name: String,
    val ingredients: List<String> = listOf(),
    val category: RecipeCategory,
)

enum class RecipeCategory {
    BURGERS, DESSERTS, PIZZA, FISH
}