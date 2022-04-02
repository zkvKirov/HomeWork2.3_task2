package ru.netology

class Graffiti (

    val url: String,
    val width: Int,
    val height: Int,
    id: Int, ownerID: Int, title: String, date: Int,
    override val type: String

    ) : Attachment(id, ownerID, title, date) {
}