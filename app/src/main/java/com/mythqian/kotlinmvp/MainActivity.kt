package com.mythqian.kotlinmvp

import android.util.Log
import com.mythqian.kotlinmvp.contract.MainContract
import com.mythqian.kotlinmvp.presenter.MainPresenter
import com.mythqian.lib_common.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainContract.View, MainContract.Presenter>(), MainContract.View {
    override fun createView(): MainContract.View {
        return this
    }

    override fun createPresenter(): MainContract.Presenter {
        Log.d("sss","Presenter")
        return MainPresenter()
    }

    override fun layoutId(): Int {
        return R.layout.activity_main
    }

    override fun init() {
        initView()
    }

    fun initView() {
        tv_request.setOnClickListener { mPresenter?.btn_request() }
    }
}
