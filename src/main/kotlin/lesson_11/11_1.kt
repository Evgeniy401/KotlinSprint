package org.example.lesson_11

fun main() {

    val vasily = User(1635131311, "vasily", "vre2357f", "vasily64626@gmail.com")
    val peter = User(1635131388, "peter", "arg&^46^%$*vg", "peter7890098@gmail.com")

    println(vasily.id)
    println(vasily.login)
    println(vasily.password)
    println(vasily.email)

    println(peter.id)
    println(peter.login)
    println(peter.password)
    println(peter.email)

}

class User(val id: Int, val login: String, var password: String, var email: String)