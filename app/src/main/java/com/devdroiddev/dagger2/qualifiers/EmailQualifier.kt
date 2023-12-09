package com.devdroiddev.dagger2.qualifiers

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier // - To make annotation qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)  // Define timeline for how much time they are valid
annotation class EmailQualifier()