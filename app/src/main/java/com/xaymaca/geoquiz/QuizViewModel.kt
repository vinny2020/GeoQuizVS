package com.xaymaca.geoquiz

import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {

    var currentIndex = 0
    var isCheater = false

    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, true),
        Question(R.string.question_australia, true),
        Question(R.string.question_australia, true)
    )

    val currentQuestionAnswer: Boolean
        get() = questionBank [currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex = (currentIndex + 1 ) % questionBank.size
    }
    fun moveToPrevious() {
        currentIndex = (currentIndex - 1 ) % questionBank.size
    }



}