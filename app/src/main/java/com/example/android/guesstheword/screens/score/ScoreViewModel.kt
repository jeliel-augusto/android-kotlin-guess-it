package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScoreInit: Int): ViewModel() {
    private val _finalScore = MutableLiveData<Int>(0)
    val finalScore: LiveData<Int>
        get() = _finalScore
    private val _playAgainEvent = MutableLiveData<Boolean>()
    val playAgainEvent: LiveData<Boolean>
        get() = _playAgainEvent

    init {
        _finalScore.value = finalScoreInit
    }
    fun playAgain() {
        _playAgainEvent.value = true
    }
    fun playAgainEventFinish() {
        _playAgainEvent.value = false
    }
}