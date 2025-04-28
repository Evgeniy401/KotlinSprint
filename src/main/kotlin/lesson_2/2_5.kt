package lesson_2

import kotlin.math.pow

fun main() {

    val initialPayment = 70_000
    val interestRate = 16.7 / 100
    val numberOfCharges = 1
    val time = 20

    val totalAmount = "%.3f".format (initialPayment * (1 + (interestRate / numberOfCharges)).pow(numberOfCharges * time))
    println(totalAmount)

}
