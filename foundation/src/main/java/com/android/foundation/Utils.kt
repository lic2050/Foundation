package com.android.foundation

import android.content.Context


object Utils {
    lateinit var context: Context

    val uiContext: Context
        get() = ActivityManager.stackTopActivity() ?: context

}


