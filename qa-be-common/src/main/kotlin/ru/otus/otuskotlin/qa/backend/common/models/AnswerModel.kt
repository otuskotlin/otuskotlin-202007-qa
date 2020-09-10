package ru.otus.otuskotlin.qa.backend.common.models

import java.time.LocalDateTime

data class AnswerModel(
        val id: String = "",
        val author: User,
        val body: String = "",
        val createTime: LocalDateTime = LocalDateTime.now(),
        val lastEditTime: LocalDateTime = LocalDateTime.now(),
        val comments: List<Comment>? = null,
        val likes: Int = 0
)