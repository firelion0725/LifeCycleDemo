package com.leo.demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class BActivity : AppCompatActivity() {

    private val TAG = "aaaaaaaaaaaa"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.i(TAG, "BActivity onCreate")

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, BFragment.newInstance())
            .commitNow()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "BActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "BActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "BActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "BActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "BActivity onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "BActivity onRestart")
    }
}