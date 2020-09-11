package com.leo.demo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.leo.demo.lifecycle.BActivity


class MainActivity : AppCompatActivity() {

    private val TAG = "aaaaaaaaaaaa"

    private val viewModel : MainViewModel  = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "MainActivity onCreate")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            startActivity(Intent(this, BActivity::class.java))
        }

        lifecycle.addObserver(viewModel)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "MainActivity onStop")
    }

    override fun onDestroy() {
        lifecycle.removeObserver(viewModel)
        super.onDestroy()
        Log.i(TAG, "MainActivity onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "MainActivity onRestart")
    }
}