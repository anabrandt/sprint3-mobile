package com.example.sprint3_doracorde.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sprint3_doracorde.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btn_lessons).setOnClickListener {
            startActivity(Intent(this, LessonActivity::class.java))
        }
    }
}