package com.quizapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.quizapp.adapter.QuizAdapter
import com.quizapp.data.QuizRepository
import com.quizapp.databinding.ActivityQuizListBinding

class QuizListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Choose a Quiz"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val quizzes = QuizRepository.allQuizzes
        binding.recyclerQuizzes.layoutManager = LinearLayoutManager(this)
        binding.recyclerQuizzes.adapter = QuizAdapter(quizzes) { quiz ->
            val intent = android.content.Intent(this, QuizActivity::class.java)
            intent.putExtra(QuizActivity.EXTRA_QUIZ_ID, quiz.id)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
