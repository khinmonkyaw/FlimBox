package com.padc.flimbox.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.padc.flimbox.R
import com.padc.flimbox.adapters.NowShowingRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_now_showing.view.*

class NowShowingFragment : Fragment() {

    val mNowShowingAdapter : NowShowingRecyclerAdapter =  NowShowingRecyclerAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_now_showing, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        view.rvNowShowing.layoutManager = GridLayoutManager(context, 2)
        view.rvNowShowing.adapter = mNowShowingAdapter

    }



}