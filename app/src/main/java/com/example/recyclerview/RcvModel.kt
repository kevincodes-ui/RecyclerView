package com.example.recyclerview

class RcvModel {

    var title: String? = null
    var message: String? = null
    var sentAt: String? = null
    var avatar: Int = 0
    var messageState: Int = 0

    fun getTitles(): String{
        return title.toString()
    }
    fun setTitles(title: String){
        this.title = title
    }

    fun getMessages(): String{
        return message.toString()
    }

    fun setMessages(message: String){
        this.message = message
    }

    fun getSentAts(): String{
        return sentAt.toString()
    }

    fun setSentAts(sentAt: String){
        this.sentAt = sentAt
    }

    fun getMessageStates(): Int{
        return messageState
    }

    fun setMessageStates(messageState: Int){
        this.messageState = messageState
    }

    fun getAvatars(): Int{
        return avatar
    }
    fun setAvatars(avatar : Int){
        this.avatar = avatar
    }


}