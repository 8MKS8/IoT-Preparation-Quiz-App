package com.quizapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_SCORE = "extra_score"
        const val EXTRA_TOTAL = "extra_total"
        const val EXTRA_QUIZ_ID = "extra_quiz_id"
    }

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra(EXTRA_SCORE, 0)
        val total = intent.getIntExtra(EXTRA_TOTAL, 0)
        val quizId = intent.getStringExtra(EXTRA_QUIZ_ID) ?: ""
        val percent = if (total > 0) (score * 100) / total else 0

        binding.tvScore.text = "$score / $total"
        binding.tvPercent.text = "$percent%"
        binding.progressBarResult.progress = percent

        binding.tvFeedback.text = when {
            percent >= 80 -> "🎉 Excellent! You're well prepared for the exam."
            percent >= 60 -> "👍 Good effort! Review the questions you missed."
            else -> "📚 Keep studying — you've got this!"
        }

        binding.btnRetake.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra(QuizActivity.EXTRA_QUIZ_ID, quizId)
            startActivity(intent)
            finish()
        }

        binding.btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}
