package com.burakiren.chatbot

import android.content.Context

class ChatBot {

    /**
     * private constructor to prevent instantiation of this class
     */
    private fun ChatBot() {}

    /**
     * Initializes ChatBotTheme with the default theme.
     *
     * @param context The context
     */
    fun initialize(context: Context?) {
        initialize(context, ChatBotTheme.newBuilder().build())
    }

    /**
     * Initializes ChatBotTheme with the custom config.
     *
     * @param context The context
     * @param config  The ChatBotTheme
     */
    fun initialize(context: Context?, theme: ChatBotTheme?) {

    }
}