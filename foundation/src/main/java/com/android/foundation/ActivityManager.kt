package com.galaxy.lgbvideo.app

import android.app.Activity
import android.app.Application
import com.android.foundation.DefaultActivityLifecycleCallbacks
import com.galaxy.lgbvideo.util.Utils
import java.lang.ref.WeakReference


object ActivityManager {

    private var stackTopActivity = WeakReference<Activity>(null)

    fun stackTopActivity(): Activity? {
        return stackTopActivity.get()
    }

    fun init() {
        (Utils.context as Application).registerActivityLifecycleCallbacks(object :
            DefaultActivityLifecycleCallbacks() {
            override fun onActivityResumed(act: Activity) {
                super.onActivityResumed(act)
                stackTopActivity = WeakReference(act)
            }
        })
    }
}