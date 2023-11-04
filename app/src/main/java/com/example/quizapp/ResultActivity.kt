package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.quizapp.databinding.ActivityMainBinding
import com.example.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(constants.USER_NAME)
        binding.tvName.text = username
        val totalQuestion = intent.getIntExtra(constants.TOTAL_QUESTION,0)
        val correctAnswer = intent.getIntExtra(constants.CORRECT_ANSWERS,0)
        binding.tvScore.text = "Your Score is $correctAnswer out of $totalQuestion"

        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}