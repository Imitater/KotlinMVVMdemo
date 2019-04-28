package com.example.linwb.childrenstudy.base

interface IBaseView{
    /**
     * 加载完成
     */
    fun loadComplete()

    /**
     * 加载失败
     */
    fun loadFailure(error : String)

}