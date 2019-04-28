package com.example.linwb.childrenstudy.mvvm.model

import android.util.Log
import com.example.linwb.childrenstudy.base.BaseLoadListener
import com.example.linwb.childrenstudy.bean.PersonBean
import com.example.linwb.childrenstudy.net.ApiClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PersonModel: IPersonModel{
    override fun loadPersonList(loadListener: BaseLoadListener<List<PersonBean>>) {
        val apiService = ApiClient().getApiService()
        apiService!!.getPersionList(1)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({ result ->
                    var result : List<PersonBean>  = result.data!!
                    loadListener.loadSucess(result)
                },
                {
                    error ->  loadListener.loadFailure(error.message!!)
                }
        )
    }
}