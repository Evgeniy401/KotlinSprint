package org.example.lesson_13

fun main() {

    fun error(str: String): Long? {
        return try {
            str.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка: $${e::class.simpleName}")
            null
        }
    }

    println("Введите ваше имя:")
    val name = readln()

    println("Введите ваш номер телефона:")
    val phoneNumber = error(readln()) ?: return

    println("Введите вашу компанию:")
    val company = readln().takeIf { it.isNotBlank() }

    val subscriber = Subscriber5(name, phoneNumber, company)
    subscriber.printData()
}

class Subscriber5(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null,
) {
    fun printData() {
        println("Имя: $name, Номер телефона: $phoneNumber, Компания: ${company ?: "не указана"}")
    }
}