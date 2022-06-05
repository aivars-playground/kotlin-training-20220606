package com.example.kotlinproject.repositories

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>

@Table("messages")
data class Message(@Id val id: String?, val text: String)
