package com.example.historyquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Nelson Mandela was president in 1994",
        "The Great Wall of China was built in one year",
        "World War II ended in 1945",
        "The pyramids were built by robots",
        "South Africa became a republic in 1961"
    )
    private val answers = arrayOf(true, false, true, false, true)

    private var index = 0
    private var score = 0

    private lateinit var questionText: TextView
    private lateinit var feedbackText: TextView
    private lateinit var trueBtn: Button
    private lateinit var falseBtn: Button
    private lateinit var nextBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        questionText = findViewById(R.id.questionText)
        feedbackText = findViewById(R.id.feedbackText)
        trueBtn = findViewById(R.id.trueBtn)
        falseBtn = findViewById(R.id.falseBtn)
        nextBtn = findViewById(R.id.nextBtn)

        questionText.text = questions[index]

        trueBtn.setOnClickListener { checkAnswer(true) }
        falseBtn.setOnClickListener { checkAnswer(false) }

        nextBtn.setOnClickListener {
            index++
            if (index < questions.size) {
                questionText.text = questions[index]
                feedbackText.text = ""
            } else {
                val intent = Intent(this, ScoreActivity::class.java)
            }
        }
    }

    private fun checkAnswer(userAnswer: Boolean) {
        if (userAnswer == answers[index]) {
            feedbackText.text = "Correct!"
            score++
        } else {
            feedbackText.text = "Incorrect"

        }
    }
}