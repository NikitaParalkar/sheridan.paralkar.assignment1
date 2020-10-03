package com.example.sheridanparalkarassignment1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_output.*

class OutputActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        btnAgain.setOnClickListener() {
            intent = Intent(this, InputActivity::class.java)
            startActivity(intent)
        }


    }
}





