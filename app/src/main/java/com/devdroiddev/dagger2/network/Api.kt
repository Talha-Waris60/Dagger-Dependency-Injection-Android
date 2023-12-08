package com.devdroiddev.dagger2.network

interface Api {
    suspend fun getUser() : String
}