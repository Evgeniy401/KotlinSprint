package lesson_4

fun main() {

    val trainingDay = 5
    val isEven = trainingDay % 2 != 0

    println("""
        Сегодня нужно выполнить:
        Упражнения для рук:    $isEven
        Упражнения для пресса: $isEven
        Упражнения для ног:    ${!isEven}
        Упражнения для спины:  ${!isEven}
    """.trimIndent())

}