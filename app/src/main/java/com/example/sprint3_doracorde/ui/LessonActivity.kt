package com.example.sprint3_doracorde.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sprint3_doracorde.R

class LessonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)

        // Faça a chamada da API de Lição
        LessonApi.getLessons { lessons ->
            // Atualizar UI com as lições
        }
    }
}