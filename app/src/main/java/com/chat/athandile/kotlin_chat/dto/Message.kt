package com.chat.athandile.kotlin_chat.dto

import com.google.firebase.Timestamp

data class Message
(
        val id:Int? = null,

        val name:String? = null,

        val  body:String? = null,

        val TimeStamp:Timestamp? = null,

        val isRead:Boolean? = null,

        val profileImageUrl:String? = null

)