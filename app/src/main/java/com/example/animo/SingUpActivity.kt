package com.example.animo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.animo.databinding.ActivitySingUpBinding
import com.example.animo.utils.replaceActivity

class SingUpActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivitySingUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySingUpBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()

        mBinding.btnReg.setOnClickListener {
            replaceActivity(MainActivity())
        }

        mBinding.btnReg.setOnClickListener {
            replaceActivity(SingInActivity())
        }
    }
}