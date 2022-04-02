package ru.netology

class Photo(

    val albumID: String,
    val userID: Int,
    val size: Array<Size>,
    val width: Int,
    val height: Int,
    id: Int, ownerID: Int, title: String, date: Int,
) : Attachment(id, ownerID, title, date) {
    override val type = TODO()
}

class Size (
    val type: String,
    val url: String,
    val width: Int,
    val height: Int
        )