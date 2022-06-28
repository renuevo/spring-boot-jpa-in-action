package com.github.renuevo.infrastructure.user

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
}