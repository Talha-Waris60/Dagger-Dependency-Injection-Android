package com.devdroiddev.dagger2.ViewModel

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.devdroiddev.dagger2.Repository.UserRepository
import javax.inject.Inject

class AuthViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {
}