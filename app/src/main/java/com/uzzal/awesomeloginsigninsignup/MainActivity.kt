package com.uzzal.awesomeloginsigninsignup

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // toi change title of a activity
        val actionBar = supportActionBar
        actionBar!!.title = "Sign In"


        val btn = findViewById<Button>(R.id.button);

        btn.setOnClickListener {

            val intent = Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }

    }
}
