package com.example.historyquiz

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScoreActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Nelson Mandela was president in 1994 - True",
        "The Great Wall of China was built in one year - False",
        "World War II ended in 1945 - True",
        "The pyramids were built by robots - False",
        "South Africa became a republic in 1961 - True"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("score", 0)

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val feedbackText = findViewById<TextView>(R.id.feedbackText)
        val reviewBtn = findViewById<Button>(R.id.reviewBtn)
        val exitBtn = findViewById<Button>(R.id.exitBtn)

        scoreText.text = "You scored $score out of 5"

        feedbackText.text = if (score >= 3) "Great job!" else "Keep practising!"

        reviewBtn.setOnClickListener {
            val message =questions.joinToString("\n\n")
            AlertDialog.Builder(this)
                .setTitle("Review Answer")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show()
        }

        exitBtn.setOnClickListener {
            finishAffinity() // Closes the app
        }
    }
}