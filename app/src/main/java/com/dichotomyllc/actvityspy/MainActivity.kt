package com.dichotomyllc.actvityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var info: String = ""
        if (savedInstanceState != null) {
            info = savedInstanceState.toString()
            info += " " + savedInstanceState.describeContents().toString()
        } else {
            info = "Information could not be initialized, Bundle is null."
        }

        Log.i(TAG, "onCreate event fired, with info: ${info}")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired!")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired!")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired!")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart event fired!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "We're going down, Captain!")
    }
}
