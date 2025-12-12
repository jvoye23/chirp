package com.jvcodingsolutions.chirp.domain.user

data class AuthenticatedUser(
    val user: User,
    val accessToken: String,
    val refreshToken: String
)
