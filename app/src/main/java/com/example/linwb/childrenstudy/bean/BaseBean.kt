package com.example.linwb.childrenstudy.bean

class BaseBean<T>{
    var errno: Int? = null
    var errmsg: String? = null
    var data: T? = null

    val isSuccess: Boolean
        get() = if (errno == 0) true else false

}