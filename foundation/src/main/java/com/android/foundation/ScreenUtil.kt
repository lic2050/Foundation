package com.android.foundation

import android.content.res.Resources

val ScreenWidth: Int
    get() = Resources.getSystem().displayMetrics.widthPixels


val ScreenHeight: Int
    get() = Resources.getSystem().displayMetrics.heightPixels


val ScreenDensity: Float
    get() = Resources.getSystem().displayMetrics.density
