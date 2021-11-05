package com.example.dayplannertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.dayplannertest.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var bindingClass: ActivityMainBinding



        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(LayoutInflater.from(application))
        setContentView(bindingClass.root)



        bindingClass.btStepToNextActivity.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
    }
}