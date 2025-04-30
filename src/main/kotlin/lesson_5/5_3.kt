package lesson_5

fun main() {

    println("Введите число 1")
    val currentNumber1 = readln().toInt()

    println("Введите чмсло 2")
    val currentNumber2 = readln().toInt()

    val correctNumber1 = 20
    val correctNumber2 = 11

    println(
    if (currentNumber1 == correctNumber1 && currentNumber2 == correctNumber2
        || currentNumber1 == correctNumber2 && currentNumber2 == correctNumber1)
        "Поздравляем! Вы выиграли главный приз! Не прошло и 1000 лет!"

    else if (currentNumber1 == correctNumber1 ||
        currentNumber1 == correctNumber2 ||
        currentNumber2 == correctNumber1 ||
        currentNumber2 == correctNumber2)
        "Вы выиграли утешительный приз! Вытрите ваши слезы!"

    else "Упсс! Неудача! :(")

}