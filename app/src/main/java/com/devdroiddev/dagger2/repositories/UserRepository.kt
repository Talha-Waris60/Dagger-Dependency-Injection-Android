package com.devdroiddev.dagger2.repositories

import android.util.Log
import com.devdroiddev.dagger2.utils.APP_TAG
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}
class RemoteSourceRepository: UserRepository{
    override
    fun saveUser(email: String, password: String) {
        Log.d(APP_TAG, "User save in Server..")
    }
}

// Inject localSourceRepository to tell dagger to create object
class LocalSourceRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(APP_TAG, "User save in Local DB..")
    }
}


