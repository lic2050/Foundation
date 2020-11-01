package com.android.foundation

fun String?.safeToInt(defaultValue: Int = 0): Int {
    return try {
        this?.toInt() ?: defaultValue
    } catch (e: NumberFormatException) {
        defaultValue
    }
}

fun String?.safeToLong(defaultValue: Long = 0): Long {
    return try {
        this?.toLong() ?: defaultValue
    } catch (e: NumberFormatException) {
        defaultValue
    }
}

fun String?.safeToFloat(defaultValue: Float = 0F): Float {
    return try {
        this?.toFloat() ?: defaultValue
    } catch (e: NumberFormatException) {
        defaultValue
    }
}

fun String?.safeToDouble(defaultValue: Double = 0.0): Double {
    return try {
        this?.toDouble() ?: defaultValue
    } catch (e: NumberFormatException) {
        defaultValue
    }
}

fun Boolean?.toInt(): Int {
    return if (this == true) 1 else 0
}

fun Int?.toBoolean(): Boolean {
    return this == 1
}

fun Int?.safeToString(defaultValue: String = ""): String {
    return try {
        this?.toString() ?: defaultValue
    } catch (e: Exception) {
        defaultValue
    }
}

fun Long?.safeToString(defaultValue: String = ""): String {
    return try {
        this?.toString() ?: defaultValue
    } catch (e: Exception) {
        defaultValue
    }
}

fun Float?.safeToString(defaultValue: String = ""): String {
    return try {
        this?.toString() ?: defaultValue
    } catch (e: Exception) {
        defaultValue
    }
}

fun Double?.safeToString(defaultValue: String = ""): String {
    return try {
        this?.toString() ?: defaultValue
    } catch (e: Exception) {
        defaultValue
    }
}
