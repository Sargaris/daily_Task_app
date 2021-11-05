package com.example.dayplannertest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.dayplannertest.databinding.ActivitySecondBinding
import kotlinx.serialization.*
import kotlinx.serialization.json.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var SecBindingClass: ActivitySecondBinding

        super.onCreate(savedInstanceState)
        SecBindingClass = ActivitySecondBinding.inflate(LayoutInflater.from(application))
        setContentView(SecBindingClass.root)

        SecBindingClass.btToStepBack.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }

}