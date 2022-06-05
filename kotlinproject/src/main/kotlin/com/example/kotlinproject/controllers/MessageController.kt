package com.example.kotlinproject.controllers

import com.example.kotlinproject.repositories.Message
import com.example.kotlinproject.services.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {

    @GetMapping
    fun index(): Iterable<Message> =
        service.findAll()

    @PostMapping
    fun post(@RequestBody message: Message) =
        service.create(message)
}
