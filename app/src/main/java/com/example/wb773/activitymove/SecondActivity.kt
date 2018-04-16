package com.example.wb773.activitymove

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //ボタンを取得
        var button: Button = findViewById(R.id.back_button)

        button.setOnClickListener{
            //Activityを終了する
            finish()
        }
    }
}
