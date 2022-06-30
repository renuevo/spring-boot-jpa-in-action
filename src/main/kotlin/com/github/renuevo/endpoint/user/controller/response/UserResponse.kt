package com.github.renuevo.endpoint.user.controller.response

import com.github.renuevo.domain.user.UserModel
import java.time.LocalDateTime

class UserResponse(
    val id: Long,
    val name: String,
    val age: Long,
    val gender: UserModel.Gender,
    val createdBy: String,
    val createdAt: LocalDateTime,
    val updatedBy: String,
    val updatedAt: LocalDateTime
)

fun UserModel.toUserResponse() = UserResponse(
    id = id,
    name = name,
    age = age,
    gender = gender,
    createdBy = createdBy!!,
    createdAt = createdAt!!,
    updatedBy = updatedBy!!,
    updatedAt = updatedAt!!
)