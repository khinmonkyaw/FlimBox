package com.padc.flimbox.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.flimbox.R
import com.padc.flimbox.data.vos.NowShowingVO
import com.padc.flimbox.views.holders.BaseViewHolder
import com.padc.flimbox.views.holders.NowShowingViewHolder

class NowShowingRecyclerAdapter : BaseRecyclerAdapter<NowShowingViewHolder,NowShowingVO> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<NowShowingVO> {

        val layoutInflater = LayoutInflater.from(parent.context)
        val v = layoutInflater.inflate(R.layout.viewholder_now_showing, parent, false)
        return NowShowingViewHolder(v)

    }

    override fun onBindViewHolder(holder: BaseViewHolder<NowShowingVO>, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

}