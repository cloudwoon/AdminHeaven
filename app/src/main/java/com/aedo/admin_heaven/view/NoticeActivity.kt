package com.aedo.admin_heaven.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.aedo.admin_heaven.BaseActivity
import com.aedo.admin_heaven.MainActivity
import com.aedo.admin_heaven.R
import com.aedo.admin_heaven.api.APIService
import com.aedo.admin_heaven.databinding.ActivityNoticeBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NoticeActivity : BaseActivity() {
    private lateinit var mBinding: ActivityNoticeBinding
    private lateinit var apiServices: APIService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_notice)
        mBinding.activity = this@NoticeActivity
        inStatusBar()
    }



    fun onBackClick(v: View) {
        moveMain()
    }

    fun onClick(v: View) {

    }

    fun onCBClick(v: View){

    }

    fun onDBClick(v: View){

    }



    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}