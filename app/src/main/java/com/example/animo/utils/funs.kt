package com.example.animo.utils

import android.content.Intent
import android.support.v7.app.AppCompatActivity

fun AppCompatActivity.replace(activity: AppCompatActivity){
    val intent = Intent(this, activity::class.java)
    startActivity(intent)
    finish()
}