package org.example

fun main() {

    val seconds: Short = 6480

    val minutes = seconds / oneMinute
    val remainingSeconds = seconds % oneMinute
    val hours = minutes / oneMinute
    val remainingMinutes = minutes % oneMinute

    println(String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds))

}

    const val oneMinute = 60