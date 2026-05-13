package com.quizapp.ui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.quizapp.R
import com.quizapp.data.QuizRepository
import com.quizapp.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_QUIZ_ID = "extra_quiz_id"
    }

    private lateinit var binding: ActivityQuizBinding
    private val viewModel: QuizViewModel by viewModels()
    private lateinit var optionButtons: List<Button>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val quizId = intent.getStringExtra(EXTRA_QUIZ_ID) ?: return finish()
        val quiz = QuizRepository.getQuizById(quizId) ?: return finish()
        viewModel.loadQuiz(quiz)

        supportActionBar?.title = quiz.title
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        optionButtons = listOf(binding.btnOptionA, binding.btnOptionB, binding.btnOptionC, binding.btnOptionD)

        optionButtons.forEachIndexed { index, button ->
            button.setOnClickListener { viewModel.selectAnswer(index) }
        }

        binding.btnNext.setOnClickListener {
            val hasMore = viewModel.nextQuestion()
            if (!hasMore) {
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra(ResultActivity.EXTRA_SCORE, viewModel.score.value ?: 0)
                    putExtra(ResultActivity.EXTRA_TOTAL, viewModel.getTotalQuestions())
                    putExtra(ResultActivity.EXTRA_QUIZ_ID, quizId)
                }
                startActivity(intent)
                finish()
            }
        }

        viewModel.currentIndex.observe(this) { renderQuestion() }
        viewModel.selectedAnswer.observe(this) { selected -> showAnswerFeedback(selected) }
    }

    private fun renderQuestion() {
        val q = viewModel.getCurrentQuestion()
        val index = viewModel.currentIndex.value ?: 0
        val total = viewModel.getTotalQuestions()

        binding.tvQuestion.text = q.questionText
        binding.tvQuestionNumber.text = "Question ${index + 1} of $total"
        binding.progressBar.progress = ((index.toFloat() / total) * 100).toInt()

        val labels = listOf("A", "B", "C", "D")
        optionButtons.forEachIndexed { i, btn ->
            btn.text = "${labels[i]}.  ${q.options[i]}"
            btn.isEnabled = true
            btn.setBackgroundColor(ContextCompat.getColor(this, R.color.option_default))
            btn.setTextColor(Color.WHITE)
        }

        binding.tvExplanation.visibility = View.GONE
        binding.btnNext.visibility = View.GONE
    }

    private fun showAnswerFeedback(selectedIndex: Int?) {
        selectedIndex ?: return
        val q = viewModel.getCurrentQuestion()

        optionButtons.forEachIndexed { i, btn ->
            btn.isEnabled = false
            when {
                i == q.correctAnswerIndex -> {
                    btn.setBackgroundColor(ContextCompat.getColor(this, R.color.correct_green))
                }
                i == selectedIndex && selectedIndex != q.correctAnswerIndex -> {
                    btn.setBackgroundColor(ContextCompat.getColor(this, R.color.wrong_red))
                }
                else -> {
                    btn.setBackgroundColor(ContextCompat.getColor(this, R.color.option_disabled))
                }
            }
        }

        if (q.explanation.isNotEmpty()) {
            binding.tvExplanation.text = "💡 ${q.explanation}"
            binding.tvExplanation.visibility = View.VISIBLE
        }

        val isLast = (viewModel.currentIndex.value ?: 0) == viewModel.getTotalQuestions() - 1
        binding.btnNext.text = if (isLast) "See Results" else "Next Question →"
        binding.btnNext.visibility = View.VISIBLE
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
