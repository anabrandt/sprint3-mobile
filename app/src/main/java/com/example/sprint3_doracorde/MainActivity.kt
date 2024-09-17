package com.example.sprint3_doracorde

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sprint3_doracorde.ui.HomeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicia a HomeActivity após a tela inicial
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}