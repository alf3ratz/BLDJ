package course.ru.myapplication.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import course.ru.myapplication.R
import course.ru.myapplication.databinding.MainFragmentBinding
import kotlinx.android.synthetic.main.main_fragment.*


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = activity?.run {
            ViewModelProviders.of(this)[MainViewModel::class.java]
        } ?: throw Exception("Invalid Activity")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.main_fragment, container, false)
        val pager: ViewPager2 = view.findViewById<View>(R.id.viewPager) as ViewPager2
        pager.adapter = OrdersPagerAdapter(this)
        var tabLayout: TabLayout = view.findViewById<View>(R.id.tabLayout) as TabLayout
        var tabLayoutMediator: Unit = TabLayoutMediator(
            tabLayout,
            pager
        ) { tab, position ->
            when (position) {
                0 -> tab.text = "Текущие объявления"
                1 -> tab.text = "История"
                else -> tab.text = "Текущие объявления"
            }
        }.attach()
        pager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                var badge : BadgeDrawable = tabLayout.getTabAt(position)!!.orCreateBadge
                badge.isVisible = false
            }
        })
        return view
        //        binding = DataBindingUtil.inflate(inflater,
//            R.layout.main_fragment, container, false)
//        var pager: ViewPager2 =
//        viewPager.adapter = OrdersPagerAdapter(this)
//        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel =
            ViewModelProviders.of(this).get(MainViewModel::class.java)


        //
    }

}