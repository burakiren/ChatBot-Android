package com.burakiren.chatbot

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
        var senderColor: Int = 123456
        var receiverColor: Int = 324567

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