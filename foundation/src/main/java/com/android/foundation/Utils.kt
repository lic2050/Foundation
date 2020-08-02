package com.android.foundation

import android.content.Context


object Utils {
    lateinit var context: Context

    fun uiContext(): Context {
        return ActivityManager.stackTopActivity() ?: context
    }
}


