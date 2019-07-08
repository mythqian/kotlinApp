package com.mythqian.kotlinmvp

import com.mythqian.kotlinmvp.contract.MainContract
import com.mythqian.kotlinmvp.presenter.MainPresenter
import com.mythqian.lib_common.base.BaseActivity

import com.ashokvarma.bottomnavigation.BottomNavigationItem
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.mythqian.module_selection.SelectionFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {
    private val fm  by lazy { supportFragmentManager }
    private val selectionFragment :SelectionFragment by lazy{ SelectionFragment()}
    override fun createView(): MainContract.View {
        return this
    }

    override fun createPresenter(): MainContract.Presenter {
        return MainPresenter()
    }

    override fun layoutId(): Int {
        return R.layout.activity_main
    }

    override fun init() {
       initBottomNavigation()
    }

    fun initBottomNavigation() {
        bottom_navigation_bar
            .addItem(BottomNavigationItem(R.drawable.ic_selection, "每日精选"))
            .addItem(BottomNavigationItem(R.drawable.ic_discovery, "发现"))
            .setFirstSelectedPosition(0)
            .initialise()
        fm.beginTransaction().replace(R.id.fl_content,selectionFragment).commit();
        bottom_navigation_bar.setTabSelectedListener(object : BottomNavigationBar.OnTabSelectedListener {
            override fun onTabSelected(position: Int) {
                val transaction = fm.beginTransaction()
                when (position) {
                    0 -> {
                        transaction.replace(R.id.fl_content, selectionFragment!!)
                    }
                    1 -> {
                        transaction.replace(R.id.fl_content, selectionFragment!!)
                    }
                    else -> {
                    }
                }
                transaction.commit()
            }
            override fun onTabUnselected(position: Int) {}
            override fun onTabReselected(position: Int) {}
        })
    }
}
