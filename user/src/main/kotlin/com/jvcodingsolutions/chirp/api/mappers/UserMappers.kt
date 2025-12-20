package com.jvcodingsolutions.chirp.api.mappers

import com.jvcodingsolutions.chirp.api.dto.AuthenticatedUserDto
import com.jvcodingsolutions.chirp.api.dto.UserDto
import com.jvcodingsolutions.chirp.domain.user.AuthenticatedUser
import com.jvcodingsolutions.chirp.domain.user.User

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto {
    return AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken
    )
}

fun User.toUserDto(): UserDto {
    return UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified
    )
}