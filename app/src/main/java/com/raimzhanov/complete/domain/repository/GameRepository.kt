package com.raimzhanov.complete.domain.repository

import com.raimzhanov.complete.domain.entity.GameSettings
import com.raimzhanov.complete.domain.entity.LevelQuestion
import com.raimzhanov.complete.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue:Int,
        countOfOptions:Int,
    ):Question
    fun getGameSettings(level:LevelQuestion):GameSettings
}