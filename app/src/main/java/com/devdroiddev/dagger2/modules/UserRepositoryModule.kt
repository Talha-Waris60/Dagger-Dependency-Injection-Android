package com.devdroiddev.dagger2.modules

import com.devdroiddev.dagger2.repositories.LocalSourceRepository
import com.devdroiddev.dagger2.repositories.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getLocalRepo(localSourceRepository: LocalSourceRepository) : UserRepository
}