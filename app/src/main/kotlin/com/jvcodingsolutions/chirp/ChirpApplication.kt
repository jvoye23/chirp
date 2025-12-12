package com.jvcodingsolutions.chirp

import com.jvcodingsolutions.chat.Test
import com.jvcodingsolutions.chirp.infra.database.entities.UserEntity
import com.jvcodingsolutions.chirp.infra.database.repositories.UserRepository
import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class ChirpApplication

fun main(args: Array<String>) {
	runApplication<ChirpApplication>(*args)
}

@Component
class Demo(
	private val userRepository: UserRepository
) {
	@PostConstruct
	fun init() {
		userRepository.save(
			UserEntity(
				email = "test@test.com",
				username = "test",
				hashedPassword = "123456",
			)
		)
	}

}
