package com.petproject.vkBot

object ControlPanel {
    fun executeCommand(command: String, peerId: Int?): Boolean {
        for (c in Commands.commands) {
            if (command.contains(c.getName())) {
                c.execute(peerId, command.substring(command.indexOf(c.getName()) + c.getName().count()))
                return true
            }
        }
        return false
    }
}