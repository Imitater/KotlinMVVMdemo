package com.example.linwb.childrenstudy.mvvm.model

import com.example.linwb.childrenstudy.base.BaseLoadListener
import com.example.linwb.childrenstudy.bean.PersonBean

interface IPersonModel{
    fun loadPersonList(loadListener: BaseLoadListener<List<PersonBean>>)
}