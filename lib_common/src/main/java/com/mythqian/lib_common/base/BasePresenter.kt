package com.mythqian.lib_common.base

open class BasePresenter<V : IBaseView> : IBasePresenter<V> {


    var mView: V? = null
        private set

    override fun attachView(view: V) {
        this.mView = view
    }

    override fun detachView() {
        this.mView = null
    }
}