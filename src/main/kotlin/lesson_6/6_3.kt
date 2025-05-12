package lesson_6

fun main() {

    println("Установите время таймера")
    var inputTimer = readln().toInt()

    while (inputTimer >= ZERO) {
        if (inputTimer == ZERO) {
            println("\nВремя вышло")
            break
        } else {
            println("Осталось секунд ${inputTimer--}")
        }
        Thread.sleep(1000)
    }
}

const val ZERO = 0