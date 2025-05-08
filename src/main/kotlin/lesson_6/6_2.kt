package lesson_6

fun main() {

    println("Установите время таймера")
    var inputTimer = readln().toInt()
    var seconds = 0

    while (inputTimer >= ZERO) {
        if (inputTimer == ZERO) {
            println("Прошло $seconds секунд")
            break
        } else {
            println(inputTimer--)
        }
        seconds++
        Thread.sleep(1000)
    }
}

const val ZERO = 0
