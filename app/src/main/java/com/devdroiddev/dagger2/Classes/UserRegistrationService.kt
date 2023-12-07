package com.devdroiddev.dagger2.Classes

import com.devdroiddev.dagger2.Repository.UserRepository

class UserRegistrationService {
    private val userRepository = UserRepository()
    private val emailService = EmailService()    /*  -> class create their dependencies   */

    fun registerUser(email : String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "Developer", "User_Registered")
    }
}

/*
 *   Unit Testing
 *   Single Repository
 *   lifetime of these objects
 *   Extensible
 */