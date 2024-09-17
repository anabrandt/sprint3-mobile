package com.example.sprint3_doracorde.api

object QuizApi {
    fun getQuizzes(callback: (List<Quiz>) -> Unit) {
        // Chame a API e retorne uma lista de quizzes
        val quizzes = listOf(
            Quiz("Quiz 1", listOf("Opção 1", "Opção 2")),
            Quiz("Quiz 2", listOf("Opção A", "Opção B"))
        )
        callback(quizzes)
    }
}