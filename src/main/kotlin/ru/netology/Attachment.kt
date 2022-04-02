package ru.netology

abstract class Attachment (
    private val id: Int,
    private val ownerID: Int,
    private val title: String,
    private val date: Int
    ) {

    abstract val type: String
    private val kindOfAttachment: Array<Unit> = Array(4, ) {id; ownerID; title; date}
    val attachments: Array<Unit> = Array(2) {type; kindOfAttachment}
}