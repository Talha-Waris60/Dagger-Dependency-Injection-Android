package com.devdroiddev.dagger2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devdroiddev.dagger2.classes.UserRegistrationService
import com.devdroiddev.dagger2.components.DaggerUserRegistrationComponent
import com.devdroiddev.dagger2.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var userRegistrationService : UserRegistrationService // Activity want this dependencies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        userRegistrationService.registerUser("talhawaris04@gmail.com", "123456")
    }
}