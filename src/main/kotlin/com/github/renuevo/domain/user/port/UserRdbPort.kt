package com.github.renuevo.domain.user.port

import com.github.renuevo.domain.user.UserModel

interface UserRdbPort {

  fun update(userModel: UserModel): UserModel

  fun save(userModel: UserModel): UserModel

  fun findById(userId: Long): UserModel?

  fun findAllByUsers(): List<UserModel>

}
