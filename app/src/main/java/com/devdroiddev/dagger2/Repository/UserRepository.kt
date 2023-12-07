package com.devdroiddev.dagger2.Repository

import android.util.Log
import com.devdroiddev.dagger2.Utils.APP_TAG
import kotlinx.coroutines.delay
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(email: String, password: String) {
        Log.d(APP_TAG, "User save in DB..")
    }
}