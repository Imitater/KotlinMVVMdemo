package com.example.linwb.childrenstudy.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.linwb.childrenstudy.base.BaseViewHolder

abstract class BaseAdapter<T>(var data: List<T> = listOf()) : RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return BaseViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent?.context), viewType, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun refreshData(newData: List<T>) {
        this.data = newData
        this.notifyDataSetChanged()
    }
}