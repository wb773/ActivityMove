package com.example.wb773.activitymove

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiirst)

        //ボタンを取得
        var button: Button = findViewById(R.id.move_button)

        button.setOnClickListener{

            //新しいActivityを起動する
            var intent: Intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


    }
}
