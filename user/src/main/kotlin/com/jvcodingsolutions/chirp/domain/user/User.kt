package com.jvcodingsolutions.chirp.domain.user

import java.util.UUID

// Using a typealias makes it easier to change the data type for UserId in the future in a single place
typealias UserId = UUID

data class User(
    val id: UserId,
    val username: String,
    val email: String,
    val hasEmailVerified: Boolean,
)
