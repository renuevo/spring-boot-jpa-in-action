package com.github.renuevo.domain.user

import java.time.LocalDateTime

data class UserModel(
        val name: String,
        val age: Long,
        val gender: Gender,
        val createdBy: String,
        val createdAt: LocalDateTime,
        val updatedBy: String,
        val updatedAt: LocalDateTime
)

enum class Gender {
    MALE, FEMALE
}