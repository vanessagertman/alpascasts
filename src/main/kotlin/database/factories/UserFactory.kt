package com.vanessa.alpascasts.database.factories


import com.vanessa.alpascasts.entities.User
import com.vanessa.alpascasts.entities.Users
import dev.alpas.hashing.Hasher
import dev.alpas.ozone.EntityFactory
import dev.alpas.ozone.faker
import java.time.Instant

internal class UserFactory(private val hasher: Hasher) : EntityFactory<User, Users>() {
    override val table = Users

    override fun entity(): User {
        return User {
            email = faker.internet().safeEmailAddress()
            password = hasher.hash("secret")
            name = faker.name().name()
            updatedAt = Instant.now()
            createdAt = Instant.now()
        }
    }

    override fun transform(name: String, value: Any?): Any? {
        return if (name == "password") {
            hasher.hash(value.toString())
        } else {
            value
        }
    }
}
