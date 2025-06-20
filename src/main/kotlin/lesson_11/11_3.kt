package org.example.lesson_11

fun main() {

    val fishing = Room(cover = "Красивая картинка", title = "Рыбалка", participants = mutableListOf())

    val randomMen = ParticipantRoom("Алеша")
    fishing.addParticipant(randomMen)

    fishing.updateStatus("Алеша", UserStatus.TALKING)
    println("${randomMen.usersName} - ${randomMen.status}")

}

class Room(
    val cover: String,
    val title: String,
    private val participants: MutableList<ParticipantRoom> = mutableListOf(),
) {
    fun addParticipant(newParticipant: ParticipantRoom) {
        participants.add(newParticipant)
    }

    fun updateStatus(usersName: String, newStatus: UserStatus) {
        for (participant in participants) {
            if (participant.usersName == usersName) {
                participant.status = newStatus
                return
            }
        }
    }
}

class ParticipantRoom(
    val usersName: String,
    var status: UserStatus = UserStatus.MICROPHONE_OFF,
)

enum class UserStatus {
    TALKING, MICROPHONE_OFF, MUTED
}