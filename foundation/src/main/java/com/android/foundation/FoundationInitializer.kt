package com.android.foundation

import android.content.Context
import androidx.startup.Initializer

class FoundationInitializer: Initializer<Unit> {
    override fun create(context: Context) {
        Utils.context = context
        ActivityManager.init()
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}