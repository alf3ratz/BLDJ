package course.ru.myapplication.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import course.ru.myapplication.R


class CurrentTripsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_current_trips, container, false)
//        val view: View = inflater.inflate(R.layout.fragment_current_trips, container, false)
//        val pager: ViewPager2 = view.findViewById<View>(R.id.viewPager) as ViewPager2
//        pager.adapter = LowerPagerAdapter(this)
//        var tabLayout: TabLayout = view.findViewById<View>(R.id.tabLayout) as TabLayout
//        var tabLayoutMediator: Unit = TabLayoutMediator(
//            tabLayout,
//            pager
//        ) { tab, position ->
//            when (position) {
//                0 -> tab.text = "Мои поездки"
//                1 -> tab.text = "Попутчики"
//                else -> tab.text = "Мои поездки"
//            }
//        }.attach()
//        pager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
//            override fun onPageSelected(position: Int) {
//                super.onPageSelected(position)
//                var badge : BadgeDrawable = tabLayout.getTabAt(position)!!.orCreateBadge
//                badge.isVisible = false
//            }
//        })
//        return view
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CurrentTripsFragment().apply {

            }
    }
}