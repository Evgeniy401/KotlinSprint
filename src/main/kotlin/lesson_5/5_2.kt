package lesson_5

import java.util.Calendar

fun main() {

    println("Введите ваш год рождения от рождества Христова")

    val yearOfBirth = readln().toInt()
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val userAge = currentYear - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")

    else println("Вы еще маленький(-ая)")

}

const val AGE_OF_MAJORITY = 18