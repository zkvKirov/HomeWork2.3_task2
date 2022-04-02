package ru.netology

class Video (

    val description: String,
    val duration: Int,
    val image: Array<Image>,
    val addingDate: Int,
    val views: Int,
    val comments: Int,
    val canAdd: Boolean,
    val isPrivate: Boolean = true,
    val width: Int,
    val height: Int,
    id: Int, ownerID: Int, title: String, date: Int, override val type: String
) : Attachment(id, ownerID, title, date) {

}

class Image (
    val width: Int,
    val url: String,
    val height: Int,
    val withPadding: Boolean = true
        )