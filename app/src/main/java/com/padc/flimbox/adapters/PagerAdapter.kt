package com.padc.flimbox.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.padc.flimbox.Fragments.NowShowingFragment
import com.padc.flimbox.Fragments.UpComingFragment

class PagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> {
                NowShowingFragment()
            }
            else -> {
                return UpComingFragment()
            }
        }


    }


    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "NowShowing"
            else -> {
                return "Upcoming"
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }


}