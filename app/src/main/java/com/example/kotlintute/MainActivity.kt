package com.example.kotlintute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubmit(view:View){
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)      //val is for non changing variables, otherwise use var when declaring
        val currentMonth = Calendar.getInstance().get(Calendar.MONTH)
        val currentDay= Calendar.getInstance().get(Calendar.DATE)

        txtView4.text="Day :   " + (currentDay - txtEdit3.text.toString().toInt())
        txtView3.text="Month :   " + (currentMonth - txtEdit2.text.toString().toInt())
        txtView2.text="Years :   " + (currentYear - txtEdit1.text.toString().toInt())
    }
}
