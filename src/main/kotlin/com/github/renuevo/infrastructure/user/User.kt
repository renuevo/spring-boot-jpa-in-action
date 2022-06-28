package com.github.renuevo.infrastructure.user

import com.github.renuevo.domain.user.Gender
import com.github.renuevo.domain.user.UserModel
import com.github.renuevo.infrastructure.common.AuditEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Table
@Entity
data class User(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        val name: String,

        val age: Long,

        val gender: Gender

) : AuditEntity()


fun UserModel.toEntity() = User(
        name = name,
        age = age,
        gender = gender
)


fun User.toModel() = UserModel(
        name = name,
        age = age,
        gender = gender,
        createdBy = createdBy,
        createdAt = createdAt,
        updatedBy = updatedBy,
        updatedAt = updatedAt,
)

