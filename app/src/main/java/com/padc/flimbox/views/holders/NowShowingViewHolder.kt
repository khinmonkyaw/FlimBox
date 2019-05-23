package com.padc.flimbox.views.holders

import android.view.View
import com.padc.flimbox.data.vos.NowShowingVO

class NowShowingViewHolder(itemView: View) : BaseViewHolder<NowShowingVO>(itemView){
    override fun setData(data: NowShowingVO) {

        mData = data
    }

    override fun onClick(v: View?) {

    }


}