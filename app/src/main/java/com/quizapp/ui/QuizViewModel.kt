package com.quizapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.quizapp.model.Question
import com.quizapp.model.Quiz

class QuizViewModel : ViewModel() {

    private lateinit var quiz: Quiz
    private val questions get() = quiz.questions

    private val _currentIndex = MutableLiveData(0)
    val currentIndex: LiveData<Int> = _currentIndex

    private val _selectedAnswer = MutableLiveData<Int?>()
    val selectedAnswer: LiveData<Int?> = _selectedAnswer

    private val _score = MutableLiveData(0)
    val score: LiveData<Int> = _score

    val userAnswers = mutableMapOf<Int, Int>() // questionId -> selectedIndex

    fun loadQuiz(q: Quiz) {
        quiz = q
        _currentIndex.value = 0
        _selectedAnswer.value = null
        _score.value = 0
        userAnswers.clear()
    }

    fun getCurrentQuestion(): Question = questions[_currentIndex.value ?: 0]

    fun getTotalQuestions() = questions.size

    fun selectAnswer(index: Int) {
        if (_selectedAnswer.value != null) return // already answered
        _selectedAnswer.value = index
        val q = getCurrentQuestion()
        userAnswers[q.id] = index
        if (index == q.correctAnswerIndex) {
            _score.value = (_score.value ?: 0) + 1
        }
    }

    fun nextQuestion(): Boolean {
        val next = (_currentIndex.value ?: 0) + 1
        return if (next < questions.size) {
            _currentIndex.value = next
            _selectedAnswer.value = null
            true
        } else {
            false
        }
    }

    fun getQuizTitle() = quiz.title
    fun getQuizId() = quiz.id
}
