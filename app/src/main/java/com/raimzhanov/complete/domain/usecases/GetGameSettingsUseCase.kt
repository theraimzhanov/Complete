package com.raimzhanov.complete.domain.usecases

import com.raimzhanov.complete.domain.entity.GameSettings
import com.raimzhanov.complete.domain.entity.LevelQuestion
import com.raimzhanov.complete.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

 operator fun invoke(level:LevelQuestion):GameSettings{
    return repository.getGameSettings(level)
 }
}