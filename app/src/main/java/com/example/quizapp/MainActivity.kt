package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Intents
import android.view.View
import android.widget.Toast
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.btnStart.setOnClickListener {
            if (binding.etName.text.toString().isEmpty()){
                Toast.makeText( this,"Please enter your name", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, QuizQustionActivity::class.java)
                intent.putExtra(constants.USER_NAME, binding.etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}