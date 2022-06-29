package com.github.renuevo.endpoint.user.service

import com.github.renuevo.domain.user.UserModel
import com.github.renuevo.domain.user.createRandUser
import com.github.renuevo.domain.user.port.UserRdbPort
import com.github.renuevo.domain.user.port.UserServicePort
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRdbPort: UserRdbPort
) : UserServicePort {

    override fun getUserInfo(userId: Long): UserModel = checkNotNull(userRdbPort.findById(userId))

    override fun createUser(): UserModel = userRdbPort.save(UserModel.createRandUser())

    override fun getUsersInfo(): List<UserModel> = userRdbPort.findAllByUsers()

    override fun updateUser(userModel: UserModel): UserModel = userRdbPort.findById(userModel.id)?.run { userRdbPort.save(userModel) } ?: throw RuntimeException()

}