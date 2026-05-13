package com.quizapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.quizapp.databinding.ItemQuizBinding
import com.quizapp.model.Quiz

class QuizAdapter(
    private val quizzes: List<Quiz>,
    private val onQuizClick: (Quiz) -> Unit
) : RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {

    inner class QuizViewHolder(private val binding: ItemQuizBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(quiz: Quiz) {
            binding.tvQuizTitle.text = quiz.title
            binding.tvQuizDescription.text = quiz.description
            binding.tvSubject.text = quiz.subject
            binding.tvQuestionCount.text = "${quiz.questions.size} questions"
            binding.root.setOnClickListener { onQuizClick(quiz) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val binding = ItemQuizBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return QuizViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        holder.bind(quizzes[position])
    }

    override fun getItemCount() = quizzes.size
}
