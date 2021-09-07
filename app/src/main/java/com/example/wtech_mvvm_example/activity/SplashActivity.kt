package com.example.wtech_mvvm_example.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.wtech_mvvm_example.R
import java.lang.Exception

class SplashActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val background = object : Thread(){
            override fun run() {
                try {
                    sleep(2500)
                    val intent = Intent(this@SplashActivity, GirisActivity::class.java)
                    startActivity(intent)
                }catch (e : Exception){
                    e.printStackTrace()
                }
            }
        }

        background.start()

    }
}