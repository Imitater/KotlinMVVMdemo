package com.example.linwb.childrenstudy.net

import com.example.linwb.childrenstudy.bean.BaseBean
import com.example.linwb.childrenstudy.bean.PersonBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface IRequest{
    @GET("/study/persionlist/uid/{uid}")
    fun getPersionList(@Path("uid")uid: Int):Observable<BaseBean<List<PersonBean>>>
}