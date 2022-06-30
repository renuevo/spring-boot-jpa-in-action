package com.github.renuevo.endpoint.user.controller.request

import com.github.renuevo.domain.user.UserModel

data class UserRequest(
  val name: String,
  val age: Long,
  val gender: UserModel.Gender
)
