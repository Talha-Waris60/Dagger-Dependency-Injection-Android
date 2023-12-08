package com.devdroiddev.dagger2.classes

import android.util.Log
import com.devdroiddev.dagger2.utils.APP_TAG
import javax.inject.Inject

// Lets say we want to send message in future
interface NotificationService {
    fun sendEmail(to: String, from: String, body: String?)
}

class EmailService @Inject constructor(): NotificationService {
    override
    fun sendEmail(to: String, from: String, body: String?) {
        Log.d(APP_TAG, "Email Sent..")
    }
}

class MessageService : NotificationService {
    override
    fun sendEmail(to: String, from: String, body: String?) {
        Log.d(APP_TAG, "Message Sent..")
    }
}