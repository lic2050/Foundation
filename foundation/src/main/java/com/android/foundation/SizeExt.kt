package com.android.foundation

import android.util.TypedValue


//fun px2dp(px: Float): Int {
//    return (px / Utils.context.resources.displayMetrics.density + 0.5f).toInt()
//}
//
//fun sp2px(sp: Float): Int {
//    return (TypedValue.applyDimension(
//        TypedValue.COMPLEX_UNIT_SP,
//        sp,
//        Utils.context.resources.displayMetrics
//    ) + 0.5f).toInt()
//}
//
//fun px2sp(px: Float): Int {
//    val fontScale = Utils.context.resources.displayMetrics.scaledDensity
//    return (px / fontScale + 0.5f).toInt()
//}

//val Int.PX: Int
//    get() = (this / Utils.context.resources.displayMetrics.density + 0.5f).toInt()


val Int.DP: Int
    get() = (TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Utils.context.resources.displayMetrics
    ) + 0.5f).toInt()

val Int.SP: Int
    get() = (TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP,
        this.toFloat(),
        Utils.context.resources.displayMetrics
    ) + 0.5f).toInt()

val Float.DP: Int
    get() = this.toInt().DP

val Float.SP: Int
    get() = this.toInt().SP

//val Float.PX: Int
//    get() = this.toInt().PX