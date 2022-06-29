package com.github.renuevo.endpoint.user.controller

import com.github.renuevo.domain.user.UserModel
import com.github.renuevo.endpoint.user.controller.request.UserRequest
import com.github.renuevo.endpoint.user.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {

    @PostMapping("/create")
    fun userCreate(): UserModel = userService.createUser()

    @GetMapping("/{userId}")
    fun userFind(@PathVariable userId: Long): UserModel = userService.getUserInfo(userId)

    @GetMapping()
    fun userAllFind(): List<UserModel> = userService.getUsersInfo()

    @PutMapping("/{userId}")
    fun userEdit(@PathVariable userId: Long, @RequestBody userRequest: UserRequest): UserModel =
        userService.updateUser(
            UserModel(
                id = userId,
                name = userRequest.name,
                age = userRequest.age,
                gender = userRequest.gender
            )
        )

}