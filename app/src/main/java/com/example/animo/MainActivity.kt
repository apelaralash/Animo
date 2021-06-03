package com.example.animo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.animo.databinding.ActivityMainBinding
import com.example.animo.utils.AUTH
import com.example.animo.utils.replaceActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ANIMO)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        //replaceActivity(SingInActivity())
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        if(AUTH.currentUser == null){
            replaceActivity(SingInActivity())
        }
    }

    private fun initFields() {
        AUTH = FirebaseAuth.getInstance()
    }
}