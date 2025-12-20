package com.jvcodingsolutions.chirp.api.dto

import com.jvcodingsolutions.chirp.domain.user.UserId

data class UserDto(
    val id: UserId,
    val email: String,
    val username: String,
    val hasVerifiedEmail: Boolean
)
