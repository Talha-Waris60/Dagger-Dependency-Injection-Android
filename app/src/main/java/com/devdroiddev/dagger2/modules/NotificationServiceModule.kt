package com.devdroiddev.dagger2.modules

import com.devdroiddev.dagger2.classes.EmailService
import com.devdroiddev.dagger2.classes.MessageService
import com.devdroiddev.dagger2.classes.NotificationService
import com.devdroiddev.dagger2.qualifiers.EmailQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService() : NotificationService {
        return MessageService()
    }

    // Dagger knows how to create their object
    @EmailQualifier  // - These are qualifiers to avoid from Confusion because dagger don't which object they provide on request
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService {
        return EmailService()
    }
}