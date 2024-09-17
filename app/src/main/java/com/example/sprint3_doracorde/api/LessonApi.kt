package com.example.sprint3_doracorde.api

object LessonApi {
    fun getLessons(callback: (List<Lesson>) -> Unit) {
        val lessons = listOf(
            Lesson("Aula 1", "Descrição da Aula 1"),
            Lesson("Aula 2", "Descrição da Aula 2")
        )
        callback(lessons)
    }
}