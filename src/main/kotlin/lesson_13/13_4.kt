package org.example.lesson_13

fun main() {

    val contacts: MutableList<Subscriber4> = mutableListOf()

    println("Введите ваше имя:")
    val name = readln()

    println("Введите ваш номер телефона:")
    val phoneNumber = readln().toLongOrNull()

    println("Введите вашу компанию:")
    val company = readln().takeIf { it.isNotBlank() }

    if (phoneNumber == null) {
        println("$name, вы не указали номер телефона")
    } else {
        val user1 = Subscriber4(name, phoneNumber, company)
        contacts.add(user1)
    }

    contacts.forEach { it.printData() }
}

class Subscriber4(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null,
) {
    fun printData() {
        println("Имя: $name, Номер телефона: $phoneNumber, Компания: ${company ?: "не указана"}")
    }
}
