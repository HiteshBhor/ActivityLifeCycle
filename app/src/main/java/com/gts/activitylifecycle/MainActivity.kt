package com.gts.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class ActivityMain : AppCompatActivity() {

    private lateinit var sampletext: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "in method onCreate")

        sampletext= findViewById(R.id.et_sampleText)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "in method onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "in method onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "in method onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "in method onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "in method onSaveInstanceState")
        outState.putString("samplekey", sampletext.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "in method onRestoreInstanceState")
        sampletext.setText(savedInstanceState.getString("samplekey"))
    }


    override fun onStop() {
        super.onStop()
        Log.i(TAG, "in method onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "in method onDestroy")
    }

    companion object {
        private val TAG = ActivityMain::class.java.simpleName
    }
}