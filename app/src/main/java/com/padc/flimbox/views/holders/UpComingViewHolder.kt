package com.padc.flimbox.views.holders

import android.view.View
import com.padc.flimbox.data.vos.UpComingVO

class UpComingViewHolder(itemView: View) : BaseViewHolder<UpComingVO> (itemView) {
    override fun setData(data: UpComingVO) {
       mData = data
    }

    override fun onClick(v: View?) {

    }
}