package com.example.linwb.childrenstudy.base

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

open class BaseViewHolder(var dataBinding: ViewDataBinding) : RecyclerView.ViewHolder(dataBinding.root) {

}