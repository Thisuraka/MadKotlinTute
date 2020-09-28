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
        txtView2.text="Age :   " + (currentYear - txtEdit1.text.toString().toInt())
    }
}
