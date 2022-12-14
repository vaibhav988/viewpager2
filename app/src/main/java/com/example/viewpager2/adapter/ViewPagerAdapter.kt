package com.example.viewpager2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2.DataModel.image
import com.example.viewpager2.ui.BlankFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager , lifecycle) {

    override fun getItemCount(): Int {
             return 4
    }

    override fun createFragment(position: Int): Fragment {

        return when(position) {
            0->{
                BlankFragment("birds")
            }
            1->{
               BlankFragment("animal")
            }
            2->{
                BlankFragment("flowers")
            }
            else->{
                BlankFragment("water")
            }
        }
    }

}