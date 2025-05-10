package lesson_6

fun main() {

    println("Установите время таймера")
    val inputTimer = readln().toInt()

    Thread.sleep(ONE_SECOND * inputTimer)
    println("Прошло $inputTimer секунд")

}

const val ONE_SECOND = 1000L
