package com.limuealimi.livedataexample

import android.util.Log
import androidx.lifecycle.*


class MyLifecycleObserver : LifecycleEventObserver {
    private val TAG = "MyLifecycleObserver"

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event) {
            Lifecycle.Event.ON_RESUME -> Log.d(TAG, "onStateChanged: ON_RESUME!! ")
            Lifecycle.Event.ON_PAUSE -> Log.d(TAG, "onStateChanged: ON_PAUSE!! ")
            else -> {}
        }
    }
}