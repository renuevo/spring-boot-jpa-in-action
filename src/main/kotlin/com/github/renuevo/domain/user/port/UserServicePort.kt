package com.github.renuevo.domain.user.port

import com.github.renuevo.domain.user.UserModel

interface UserServicePort {

    fun getUserInfo(userId: Long): UserModel

    fun createUser(): UserModel

    fun getUsersInfo(): List<UserModel>

    fun updateUser(userModel: UserModel): UserModel

}