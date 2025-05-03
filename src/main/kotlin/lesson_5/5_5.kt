package lesson_5

fun main() {

    println("Вращайте барабан \n\nВведите число 1")
    val currentNumber1 = readln().toInt()

    println("Введите чмсло 2")
    val currentNumber2 = readln().toInt()

    println("Введите чмсло 2")
    val currentNumber3 = readln().toInt()

    val correctNumbers = List(3) { (0..42).random() }
    val currentNumbers = listOf(currentNumber1, currentNumber2, currentNumber3)

    val comparison = correctNumbers.intersect(currentNumbers)
    val coincidences = comparison.size

    println(
        when (coincidences) {
            3 -> "Спокойно! Не бейте стекла! Вы угадали три числа и выиграли джекпот"
            2 -> "Поздравляем! Вы угадали два числа и выиграли крупный приз!"
            1 -> "Вы угадали одно число и выиграли утешительный приз! Вытрите ваши слезы!"
            else -> "Упсс! Неудача! :("
        }
    )

    println("А правильные числа были: ${correctNumbers[0]}, ${correctNumbers[1]} и ${correctNumbers[2]}")

}