package com.example.project.user.repository

import com.example.project.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun existsByEmailAndPassword(email: String, password: String): Boolean
}