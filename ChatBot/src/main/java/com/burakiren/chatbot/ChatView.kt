package com.burakiren.chatbot

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.inputmethod.InputMethodManager
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

class ChatView : LinearLayout {
    private lateinit var inputMethodManager: InputMethodManager
    private var sendIconId = 123//R.drawable.ic_action_send
    private var optionIconId = 123 //R.drawable.ic_action_add
    private var sendIconColor = ContextCompat.getColor(context, R.color.lightBlue500)
    private var optionIconColor = ContextCompat.getColor(context, R.color.lightBlue500)
    private var isEnableAutoScroll = true
    private var isEnableAutoHidingKeyboard = true
    private var attribute: Attribute

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        attribute = Attribute(context, attrs)
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        attribute = Attribute(context, attrs)
        init(context)
    }

    private fun init(context: Context) {
        inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        LayoutInflater.from(context).inflate(R.layout.chat_view, this)
    }
}