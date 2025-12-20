package com.jvcodingsolutions.chirp.infra.database.mappers

import com.jvcodingsolutions.chirp.domain.user.User
import com.jvcodingsolutions.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User {
    return User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail
    )
}