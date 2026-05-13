package com.quizapp.model

data class Quiz(
    val id: String,
    val title: String,
    val description: String,
    val subject: String,
    val questions: List<Question>
)
