package com.devdroiddev.dagger2.classes

import com.devdroiddev.dagger2.qualifiers.EmailQualifier
import com.devdroiddev.dagger2.repositories.UserRepository
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,     /*  -> class create their dependencies   */
    @EmailQualifier private val notificationService: NotificationService
) {

    fun registerUser(email : String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.sendEmail(email, "Developer", "User_Registered")
    }
}

/*
 *   Unit Testing
 *   Single Repository
 *   lifetime of these objects
 *   Extensible
 */