package com.devdroiddev.dagger2.Classes

import android.util.Log
import com.devdroiddev.dagger2.Utils.APP_TAG

class EmailService {
    fun sendEmail(to : String, from: String, body: String?) {
        Log.d(APP_TAG, "Email Sent..")
    }
}