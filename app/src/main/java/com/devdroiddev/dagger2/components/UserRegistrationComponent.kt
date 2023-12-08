package com.devdroiddev.dagger2.components

import com.devdroiddev.dagger2.activities.MainActivity
import com.devdroiddev.dagger2.modules.NotificationServiceModule
import com.devdroiddev.dagger2.modules.UserRepositoryModule
import dagger.Component

// Internally Dagger generates a class and implement this interface
@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    // Another way - Define consumer in component to get access of all dependencies in graph
    fun inject(mainActivity: MainActivity)
}