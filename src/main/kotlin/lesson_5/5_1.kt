package lesson_5

fun main() {

    println("Авторизация пользователя, введите ответ:\n" +
            " 4+3 ")

    val example = readln().toInt()

    if (example == 7)
        println("Добро пожаловать")

    else println("Доступ запрещен")

}