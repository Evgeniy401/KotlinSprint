package org.example.lesson_13

fun main() {

    val contacts: MutableList<Subscriber4> = mutableListOf(
        Subscriber4("Миша"),
        Subscriber4("Василий", 83285412958, "null"),
        Subscriber4("Федор", 8391523895),
        Subscriber4("Дмитрий", 8948456872, "ОАО Конфетка"),
        Subscriber4("Александр", 8965896458, "ПАО Чита-дрита"),
        Subscriber4("Даниил", 89209541257)
    )

    contacts.forEach { it.printData() }
    println("\nPhone book: $phoneBook")

}

val phoneBook: MutableList<Long> = mutableListOf()

class Subscriber4(
    private val name: String,
    private val phoneNumber: Long? = null,
    private val company: String? = null,
) {
    fun printData() {
        return println("Имя: $name, Номер телефона: $phoneNumber, Компания: $company")
    }


    init {
        if (phoneNumber == null) {
            println("$name, вы не указали номер телефона")
        } else {
            phoneBook.add(phoneNumber)
        }
    }
}