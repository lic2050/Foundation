package com.android.foundation

fun String?.safeToInt(): Int {
    return try {
        this?.toInt() ?: 0
    } catch (e: NumberFormatException) {
        0
    }
}

fun String?.safeToLong(): Long {
    return try {
        this?.toLong() ?: 0L
    } catch (e: NumberFormatException) {
        0
    }
}

fun String?.safeToFloat(): Float {
    return try {
        this?.toFloat() ?: 0F
    } catch (e: NumberFormatException) {
        0f
    }
}

fun String?.safeToDouble(): Double {
    return try {
        this?.toDouble() ?: 0.0
    } catch (e: NumberFormatException) {
        0.0
    }
}

fun Boolean?.toInt(): Int {
    return if (this == true) 1 else 0
}

fun Int?.toBoolean(): Boolean {
    return this == 1
}

fun Int?.safeToString(): String {
    return try {
        this.toString()
    } catch (e: Exception) {
        ""
    }
}

fun Long?.safeToString(): String {
    return try {
        this.toString()
    } catch (e: Exception) {
        ""
    }
}

fun Float?.safeToString(): String {
    return try {
        this.toString()
    } catch (e: Exception) {
        ""
    }
}

fun Double?.safeToString(): String {
    return try {
        this.toString()
    } catch (e: Exception) {
        ""
    }
}
