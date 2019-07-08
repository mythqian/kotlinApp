package com.mythqian.lib_common.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<V : IBaseView, P : IBasePresenter<V>> : AppCompatActivity() {

    protected val mView: V by lazy { createView() }

    protected val mPresenter: P by lazy { createPresenter() }


    abstract fun createView(): V
    abstract fun createPresenter(): P
    abstract fun layoutId(): Int
    abstract fun init()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        mPresenter.attachView(mView)
        init()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}