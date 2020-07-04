package com.galaxy.lgbvideo.util

import android.graphics.drawable.Drawable
import android.os.Build

fun drawable(drawable: Int): Drawable {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        Utils.uiContext().resources.getDrawable(drawable, null)
    } else {
        Utils.uiContext().resources.getDrawable(drawable)
    }
}


fun string(stringId: Int, vararg string: String): String {
    return Utils.uiContext().getString(stringId, string)
}


fun color(colorId: Int): Int {
    return Utils.uiContext().resources.getColor(colorId)
}

