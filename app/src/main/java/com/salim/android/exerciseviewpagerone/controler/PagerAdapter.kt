package com.salim.android.exerciseviewpagerone.controler

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.salim.android.exerciseviewpagerone.view.AboutFragment
import com.salim.android.exerciseviewpagerone.view.SkillFragment
import com.salim.android.exerciseviewpagerone.view.WorkkFragment

class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 ->return AboutFragment()
            1 ->return SkillFragment()
            2 ->return WorkkFragment()
        }
        return AboutFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 ->return "HOME"
            1 ->return "SKILL"
            2 ->return "WORK"
        }
        return super.getPageTitle(position)
    }

}