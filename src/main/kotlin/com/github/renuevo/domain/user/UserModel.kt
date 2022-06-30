package com.github.renuevo.domain.user

import java.time.LocalDateTime

data class UserModel(
  val id: Long = 0L,
  val name: String,
  val age: Long,
  val gender: Gender,
  val createdBy: String? = null,
  val createdAt: LocalDateTime? = null,
  val updatedBy: String? = null,
  val updatedAt: LocalDateTime? = null
) {

  companion object {
    fun createRandUser(): UserModel {
      val charPool: List<Char> = ('a'..'z') + ('A'..'Z')
      val name = (0..5)
        .map { _ -> charPool[kotlin.random.Random.nextInt(charPool.size)] }.joinToString("")

      return UserModel(
        name = name,
        age = kotlin.random.Random.nextLong(20, 30),
        gender = Gender.values()[kotlin.random.Random.nextInt(0, 2)]
      )
    }
  }

  enum class Gender {
    MALE, FEMALE
  }

}
