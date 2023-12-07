package com.devdroiddev.dagger2.Acitivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devdroiddev.dagger2.Classes.UserRegistrationService
import com.devdroiddev.dagger2.R

class MainActivity : AppCompatActivity() {

    private val userRegistrationService = UserRegistrationService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRegistrationService.registerUser("talhawaris04@gmail.com", "123456")
    }
}