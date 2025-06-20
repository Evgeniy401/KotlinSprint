package org.example.lesson_11

class Ingredients(
    val id: Int,
    val name: String,
    val measure: String,
)

class Recipe(
    val id: Int,
    val name: String,
    val ingredients: List<Ingredients> = listOf(),
)

class Category(
    val id: Int,
    val name: String,
    val recipe: List<Recipe> = listOf(),
)