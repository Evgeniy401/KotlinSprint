package lesson_2

fun main() {

    val crystal = 7
    val iron = 11

    val crystalBuff = buff(crystal)
    val ironBuff = buff(iron)

    println(crystalBuff)
    println(ironBuff)

}

fun buff (source: Int): Int {
    return source * 20 / 100
}