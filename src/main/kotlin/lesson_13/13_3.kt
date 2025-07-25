package org.example.lesson_13

fun main() {

    val contacts: MutableList<Subscriber3> = mutableListOf(
        Subscriber3("Василий", 83285412958, "null"),
        Subscriber3("Федор", 8391523895),
        Subscriber3("Дмитрий", 8948456872, "ОАО Конфетка"),
        Subscriber3("Александр", 8965896458, "ПАО Чита-дрита"),
        Subscriber3("Даниил", 89209541257),
    )

    val companies: List<String> = contacts.mapNotNull { it.company }.distinct()
    print(companies)
}

class Subscriber3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)