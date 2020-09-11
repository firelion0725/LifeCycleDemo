package com.leo.demo.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.leo.demo.R

class BFragment : Fragment() {

    private val TAG = "aaaaaaaaaaaa"

    private val viewModel: BViewModel by viewModels()

    companion object {
        fun newInstance() = BFragment()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG,"BFragment onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"BFragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG,"BFragment onCreateView")
        return inflater.inflate(R.layout.b_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG,"BFragment onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"BFragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"BFragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"BFragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"BFragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG,"BFragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"BFragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG,"BFragment onDetach")
    }


}