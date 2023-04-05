package com.example.crazymotion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class EditImage : AppCompatActivity() {

    val TAG = "이미지 수정 액티비티"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_image)
    } // onCreate()

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() 호출됨")
    } // onStart()

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() 호출됨")
    } // onResume()

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() 호출됨")
    } // onPause()

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() 호출됨")
    } // onStop()

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() 호출됨")
    } // onRestart()

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() 호출됨")
    } // onDestroy()

} // EditImage