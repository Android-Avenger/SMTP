package com.example.smtp

import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

class SMTP {
//    try {
//        val stringSenderEmail = "andriodavengers@gmail.com"
//        val stringReceiverEmail = "tayybaadien@gmail.com"
//        val stringPasswordSenderEmail = "dgjhdqolnkbktffk"
//        val stringHost = "smtp.gmail.com"
//        val properties = System.getProperties()
//        properties["mail.smtp.host"] = stringHost
//        properties["mail.smtp.port"] = "465"
//        properties["mail.smtp.ssl.enable"] = "true"
//        properties["mail.smtp.auth"] = "true"
//        val session = Session.getInstance(properties, object : Authenticator() {
//            override fun getPasswordAuthentication(): PasswordAuthentication {
//                return  PasswordAuthentication(
//                    stringSenderEmail,
//                    stringPasswordSenderEmail
//                )
//            }
//        })
//        val mimeMessage = MimeMessage(session)
//        mimeMessage.addRecipient(
//            Message.RecipientType.TO,
//            InternetAddress(stringReceiverEmail)
//        )
//        mimeMessage.subject = "Subject: Android App email"
//        mimeMessage.setText("Hello Programmer, \n\nProgrammer World has sent you this 2nd email. \n\n Cheers!\nProgrammer World")
//        val thread = Thread {
//            try {
//                Transport.send(mimeMessage)
//            } catch (e: MessagingException) {
//                e.printStackTrace()
//            }
//        }
//        thread.start()
//    } catch (e: AddressException) {
//        e.printStackTrace()
//    } catch (e: MessagingException) {
//        e.printStackTrace()
//    }
}