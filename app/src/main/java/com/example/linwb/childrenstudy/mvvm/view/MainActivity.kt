package com.example.linwb.childrenstudy

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.linwb.childrenstudy.adapter.PersonAdapter
import com.example.linwb.childrenstudy.base.IBaseView
import com.example.linwb.childrenstudy.databinding.ActivityMainBinding
import com.example.linwb.childrenstudy.mvvm.viewmodel.PersonViewModel


class MainActivity : AppCompatActivity() ,IBaseView {
    var mPersonVM : PersonViewModel? = null
    var mAdapter : PersonAdapter? = null
    var mBinding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        initView()
        mPersonVM = PersonViewModel(this, mAdapter!!)

    }

    fun initView(){
        val layoutManager = LinearLayoutManager(this)
        mBinding!!.rvPerson.layoutManager = layoutManager
        mAdapter = PersonAdapter()
        mBinding!!.rvPerson.adapter = mAdapter

    }


    override fun loadComplete() {
    }

    override fun loadFailure(error : String) {
    }
}



