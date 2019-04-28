package com.example.linwb.childrenstudy.mvvm.viewmodel

import com.example.linwb.childrenstudy.adapter.PersonAdapter
import com.example.linwb.childrenstudy.base.BaseLoadListener
import com.example.linwb.childrenstudy.base.IBaseView
import com.example.linwb.childrenstudy.bean.PersonBean
import com.example.linwb.childrenstudy.mvvm.model.IPersonModel
import com.example.linwb.childrenstudy.mvvm.model.PersonModel

class PersonViewModel(personView : IBaseView,adapter : PersonAdapter): BaseLoadListener<List<PersonBean>>{
    private var mPersonView : IBaseView = personView
    private var mAdapter : PersonAdapter = adapter
    private var mPersonModel : IPersonModel? = null

    init {
        mPersonModel = PersonModel()
        getFristData()
    }

    private fun getFristData(){
        mPersonModel!!.loadPersonList(this)
    }

    override fun loadSucess(list: List<PersonBean>) {
        mAdapter.refreshData(list)
        mPersonView.loadComplete()

    }
    override fun loadFailure(error: String) {
        mPersonView.loadFailure(error)

    }
}