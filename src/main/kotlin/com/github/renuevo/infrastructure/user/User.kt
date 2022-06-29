package com.github.renuevo.infrastructure.user

import com.github.renuevo.domain.user.Gender
import com.github.renuevo.domain.user.UserModel
import com.github.renuevo.infrastructure.common.AuditEntity
import javax.persistence.*

@Table
@Entity
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,

    val age: Long,

    @Enumerated(EnumType.STRING)
    val gender: Gender

) : AuditEntity()


fun UserModel.toEntity() = User(
    id = id,
    name = name,
    age = age,
    gender = gender
)


fun User.toModel() = UserModel(
    id = id,
    name = name,
    age = age,
    gender = gender,
    createdBy = createdBy,
    createdAt = createdAt,
    updatedBy = updatedBy,
    updatedAt = updatedAt,
)

