package org.example.lesson_13

fun main() {

    val user1 = Subscriber2("Peter", 89204529548)

    user1.printData()

}

class Subscriber2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
    val dataCompany: String = company ?: "не указано"
) {

    fun printData() {
       return println("Имя: $name, Номер телефона: $phoneNumber, Компания: $dataCompany")
    }
}