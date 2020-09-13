package com.android.foundation

import android.view.View
import android.view.ViewGroup

/**
 * 从父布局中移除自己
 */
fun View.removeSelf() {
    (parent as? ViewGroup)?.removeView(this)
}

fun View.visible() {
    if (!isVisible()) {
        visibility = View.VISIBLE
    }
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    if (!isGone()) {
        visibility = View.GONE
    }
}

fun View.setVisible(visible: Boolean) {
    if (visible) visible() else gone()
}


fun View.isVisible(): Boolean {
    return visibility == View.VISIBLE
}

fun View.isInvisible(): Boolean {
    return visibility == View.INVISIBLE
}

fun View.isGone(): Boolean {
    return visibility == View.GONE
}

fun View.setPaddingTop(top: Int) {
    setPaddingRelative(paddingStart, top, paddingEnd, paddingBottom)
}

fun View.setPaddingBottom(bottom: Int) {
    setPaddingRelative(paddingStart, paddingTop, paddingEnd, bottom)
}

fun View.setPaddingStart(start: Int) {
    setPaddingRelative(start, paddingTop, paddingEnd, paddingEnd)
}

fun View.setPaddingEnd(end: Int) {
    setPaddingRelative(paddingStart, paddingTop, paddingEnd, end)
}

fun View.setWidth(width: Int) {
    layoutParams.width = width
    requestLayout()
}

fun View.setHeight(height: Int) {
    layoutParams.height = height
    requestLayout()
}

fun View.setSize(width: Int, height: Int) {
    layoutParams.width = width
    layoutParams.height = height
    requestLayout()
}


/**
 * Return the width of view.
 *
 * @param view The view.
 * @return the width of view
 */
fun View.getMeasuredWidth(): Int {
    return measureView()[0]
}

/**
 * Return the height of view.
 *
 * @param view The view.
 * @return the height of view
 */
fun View.getMeasuredHeight(): Int {
    return measureView()[1]
}

/**
 * Measure the view.
 *
 * @param view The view.
 * @return arr[0]: view's width, arr[1]: view's height
 */
fun View.measureView(): IntArray {
    var lp = layoutParams
    if (lp == null) {
        lp = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }
    val widthSpec = ViewGroup.getChildMeasureSpec(0, 0, lp.width)
    val lpHeight = lp.height
    val heightSpec: Int
    heightSpec = if (lpHeight > 0) {
        View.MeasureSpec.makeMeasureSpec(lpHeight, View.MeasureSpec.EXACTLY)
    } else {
        View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
    }
    measure(widthSpec, heightSpec)
    return intArrayOf(measuredWidth, measuredHeight)
}
//
////防止多次点击
//fun View.setNoDoubleClickListener(
//    delayTime: Long = 500,
//    action: View.() -> Unit
//) {
//    setOnClickListener(object : NoDoubleClickListener(delayTime) {
//        override fun onNoDoubleClick(view: View) {
//            action(view)
//        }
//    })
//}
//
//abstract class NoDoubleClickListener(private val minDelayTime: Long = 500) : View.OnClickListener {
//    //上次点击时间戳
//    private var lastClickTime: Long = 0
//
//    //上次点击View
//    private var lastView: View? = null
//    override fun onClick(currentView: View) {
//        val currentTime = System.currentTimeMillis()
//        if (lastView != currentView || currentTime - lastClickTime > minDelayTime) {
//            lastView = currentView
//            lastClickTime = currentTime
//            onNoDoubleClick(currentView)
//        }
//    }
//
//    abstract fun onNoDoubleClick(view: View)
//}