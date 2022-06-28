package com.github.renuevo.infrastructure.user

import com.github.renuevo.domain.user.UserModel
import com.github.renuevo.domain.user.port.UserRdbPort
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class UserRdbAdapter(private val userRepository: UserRepository) : UserRdbPort {
    override fun save(userModel: UserModel): UserModel = userRepository.save(userModel.toEntity()).toModel()

    override fun findById(userId: Long): UserModel? = userRepository.findByIdOrNull(userId)?.toModel()

    override fun findAllByUsers(): List<UserModel> = userRepository.findAll().map { it.toModel() }
}