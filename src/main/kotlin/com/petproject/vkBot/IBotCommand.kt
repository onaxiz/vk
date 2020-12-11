package com.petproject.vkBot

interface IBotCommand {
    fun getName(): String
    fun execute(peerId: Int?, args: String)
}