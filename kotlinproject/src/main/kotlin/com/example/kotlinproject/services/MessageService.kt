package com.example.kotlinproject.services

import com.example.kotlinproject.repositories.Message
import com.example.kotlinproject.repositories.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findAll(): Iterable<Message> =
        db.findAll()

    fun create(message: Message): Message =
        db.save(message)
}