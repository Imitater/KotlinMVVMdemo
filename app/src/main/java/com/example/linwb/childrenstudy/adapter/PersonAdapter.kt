package com.example.linwb.childrenstudy.adapter
import android.databinding.ViewDataBinding
import com.example.linwb.childrenstudy.BR
import com.example.linwb.childrenstudy.R
import com.example.linwb.childrenstudy.base.BaseViewHolder
import com.example.linwb.childrenstudy.bean.PersonBean

class PersonAdapter : BaseAdapter<PersonBean>(){
    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        var binding : ViewDataBinding = holder.dataBinding
        binding.setVariable(BR.personBean,data.get(position))
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_person
    }

}