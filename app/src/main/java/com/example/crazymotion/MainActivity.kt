package com.example.crazymotion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.crazymotion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    val TAG = "메인 액티비티"
    // 전역 변수로 바인딩 객체 선언
    var mbinding: ActivityMainBinding? = null
    // 매번 null 체크를 할 필요 없이 편의성을 위해 바인딩 변수 재 선언
    val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate() 호출됨")

        // 자동 생성된 뷰 바인딩 클래스에서의 inflate라는 메서드를 활용해서
        // 액티비티에서 사용할 바인딩 클래스의 인스턴스 생성
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        // getRoot 메서드로 레이아웃 내부의 최상위 위치 뷰의
        // 인스턴스를 활용하여 생성된 뷰를 액티비티에 표시.
        setContentView(binding.root)

        // 이제부터 binding 바인딩 변수를 활용하여 마음 껏 xml 파일 내의 뷰 id 접근이 가능.
        // 뷰 id도 파스칼케이스 + 카멜케이스의 네이밍규칙 적용으로 인해서 tv_message -> tvMessage 로 자동 변환.
        val intent = Intent(this, EditImage::class.java)
        binding.nextBtnMain.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"클릭", Toast.LENGTH_SHORT).show();

            startActivity(intent)
        })

        binding.infoBtnMain.setOnClickListener(View.OnClickListener {

        })

        binding.pickImageMain.setOnClickListener(View.OnClickListener {

        })


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
        // onDestroy 에서 binding class 인스턴스 참조를 정리.
        mbinding = null

    } // onDestroy()

} // MainActivity