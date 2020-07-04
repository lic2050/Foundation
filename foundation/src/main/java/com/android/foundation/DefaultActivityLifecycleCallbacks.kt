package com.android.foundation

import android.app.Activity
import android.app.Application
import android.os.Bundle

abstract class DefaultActivityLifecycleCallbacks : Application.ActivityLifecycleCallbacks {
    override fun onActivityPaused(act: Activity) {
    }

    override fun onActivityStarted(act: Activity) {
    }

    override fun onActivityDestroyed(act: Activity) {
    }

    override fun onActivitySaveInstanceState(act: Activity, p1: Bundle) {
    }

    override fun onActivityStopped(act: Activity) {
    }

    override fun onActivityCreated(act: Activity, p1: Bundle?) {
    }

    override fun onActivityResumed(act: Activity) {
    }
}