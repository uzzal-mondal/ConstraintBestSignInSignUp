package com.uzzal.awesomeloginsigninsignup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // toi change title of a activity
        val actionBar = supportActionBar
        actionBar!!.title = "Sign Up"


    }
}
