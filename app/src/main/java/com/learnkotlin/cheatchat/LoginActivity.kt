package com.learnkotlin.cheatchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onHandleBtnRegister(view: View){
//        val loginIntent = Intent(this, LoginActivity::class.java)
//        startActivity(loginIntent)
    }

    fun onHandleBtnLogin(view: View){

    }

}