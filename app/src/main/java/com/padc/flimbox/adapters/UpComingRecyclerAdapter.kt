package com.padc.flimbox.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padc.flimbox.R
import com.padc.flimbox.data.vos.UpComingVO
import com.padc.flimbox.views.holders.BaseViewHolder

import com.padc.flimbox.views.holders.UpComingViewHolder

class UpComingRecyclerAdapter : BaseRecyclerAdapter<UpComingViewHolder,UpComingVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<UpComingVO> {

        val layoutInflater = LayoutInflater.from(parent.context)
        val v = layoutInflater.inflate(R.layout.viewholder_upcoming, parent, false)
        return UpComingViewHolder(v)
    }


    override fun onBindViewHolder(holder: BaseViewHolder<UpComingVO>, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }


}