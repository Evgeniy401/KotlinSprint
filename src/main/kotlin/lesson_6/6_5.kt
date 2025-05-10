package lesson_6

fun main() {

    println("Проверка на бота\n")
    var tryNumber = 3

    while (tryNumber > 0) {
        val (num1, num2) = List(2) { (1..9).random() }
        val correctAnswer = num1 + num2

        println("Решите пример: $num1 + $num2")
        val inputAnswer = readln().toInt()

        if (inputAnswer == correctAnswer) {
            println("Добро пожаловать!")
            break

        } else if (tryNumber == 1) {
            println("Ответ неверный!\nДоступ запрещен!")
            break

        } else {
            println("Ответ неверный!")
            tryNumber--
        }
    }
}