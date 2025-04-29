package lesson_2

fun main() {

    val crystal = 7
    val iron = 11
    val buffSource: Float = 20 / 100f
    val prefix = "Бафф ресурса"

    println("$prefix crystal = ${(crystal * buffSource).toInt()}")
    println("$prefix iron = ${(iron * buffSource).toInt()}")

}

