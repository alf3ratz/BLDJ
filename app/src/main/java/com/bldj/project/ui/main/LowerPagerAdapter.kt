package course.ru.myapplication.ui.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class LowerPagerAdapter(fragmentActivity: Fragment): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> MyTripsFragment()
            1-> TravelersFragment()
            else -> CurrentTripsFragment()
        }
    }
}