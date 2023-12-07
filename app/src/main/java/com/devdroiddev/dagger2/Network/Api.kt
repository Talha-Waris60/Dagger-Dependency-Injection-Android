package com.devdroiddev.dagger2.Network

interface Api {
    suspend fun getUser() : String
}