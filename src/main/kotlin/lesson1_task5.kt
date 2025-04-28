package org.example

fun main() {

    val seconds: Short = 6480

    val minutes = seconds / ONE_MINUTE
    val remainingSeconds = seconds % ONE_MINUTE
    val hours = minutes / ONE_MINUTE
    val remainingMinutes = minutes % ONE_MINUTE

    println(String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds))

}

const val ONE_MINUTE = 60