package com.padc.flimbox.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.padc.flimbox.R
import com.padc.flimbox.adapters.UpComingRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_upcoming.view.*

class UpComingFragment : Fragment() {

    val mUpComingAdapter : UpComingRecyclerAdapter = UpComingRecyclerAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_upcoming, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.rvUpComing.layoutManager = GridLayoutManager(context, 2)
        view.rvUpComing.adapter = mUpComingAdapter


    }
}