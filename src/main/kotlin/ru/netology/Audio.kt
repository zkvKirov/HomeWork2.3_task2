package ru.netology

class Audio(
    id: Int,
    ownerID: Int,
    title: String,
    date: Int,
    val artist: String,
    val duration: Int,
    val url: String,
    val albumID: Int,
    val genreID: Int
    ) : Attachment(id, ownerID, title, date) {
    override val type = "Audio"
    val audio = Audio(1, 2, "songs", 22011999, "artist", 5, "___", 3, 4)
}

