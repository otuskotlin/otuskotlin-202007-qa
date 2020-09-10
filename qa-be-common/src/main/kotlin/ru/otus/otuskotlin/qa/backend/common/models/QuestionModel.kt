package ru.otus.otuskotlin.qa.backend.common.models

import java.io.File
import java.time.LocalDateTime


data class QuestionModel(
        val id: String = "",
        val title: String ="",
        val author: User,
        val description: Description,
        val createTime: LocalDateTime = LocalDateTime.now(),
        val lastEditTime: LocalDateTime = LocalDateTime.now(),
        val answers: List<AnswerModel>? = null,
        val comments: List<Comment>? = null,
        val viewed: Int = 0,
        val rating: Int = 0
)

data class User (
        val id: String = "",
        val login: String = "",
        val rating: Int = 0
)

data class Description(
        val text: String = "",
        val attachments: List<File>? = null,
        val hashTags: List<String> = listOf()
)

data class Comment(
        val id: String = "",
        val user: User,
        val message: String = "",
        val createTime: LocalDateTime = LocalDateTime.now(),
        val lastEditTime: LocalDateTime = LocalDateTime.now()
)