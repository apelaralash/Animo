package com.example.animo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.animo.databinding.ActivitySingInBinding
import com.example.animo.utils.replaceActivity

class SingInActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivitySingInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySingInBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mBinding.btnEnter.setOnClickListener {
            replaceActivity(MainActivity())
        }

        mBinding.btnReg.setOnClickListener {
            replaceActivity(SingUpActivity())
        }
    }
}