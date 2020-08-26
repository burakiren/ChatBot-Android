package com.burakiren.chatbot

import android.graphics.Color

class ChatBotTheme(builder: Builder) {

    private var senderColor: Int
    private var receiverColor: Int

    companion object {
        fun newBuilder(): Builder {
            return Builder()
        }
    }

    init {
        senderColor = builder.senderColor
        receiverColor = builder.receiverColor
    }

    class Builder {
        var senderColor: Int = Color.RED
        var receiverColor: Int = Color.BLUE

        fun setSenderColor(senderColor: Int): Builder {
            this.senderColor = senderColor
            return this
        }

        fun setReceiverColor(receiverColor: Int): Builder {
            this.receiverColor = receiverColor
            return this
        }

        fun build(): ChatBotTheme {
            return ChatBotTheme(this)
        }
    }
}
