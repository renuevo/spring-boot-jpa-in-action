package com.github.renuevo.domain.user.port

import com.github.renuevo.domain.user.UserModel
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
interface UserServicePort {

  fun getUserInfo(userId: Long): UserModel

  @Transactional
  fun createUser(): UserModel

  fun getUsersInfo(): List<UserModel>

  @Transactional
  fun updateUser(userModel: UserModel): UserModel

}
