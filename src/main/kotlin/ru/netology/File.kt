package ru.netology

class File (

    val size: Int,
    val ext: String,
    val url: String,
    override val type: String, id: Int, ownerID: Int, title: String, date: Int,

    ) : Attachment(id, ownerID, title, date) {
}
