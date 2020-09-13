package com.android.foundation

inline fun Any?.notNull(): Boolean{
    return this != null
}

inline fun Any?.isNull(): Boolean{
    return this == null
}
