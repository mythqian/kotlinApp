package com.mythqian.lib_common.base

interface IBasePresenter<in V : IBaseView> {
    fun attachView(view: V)
    fun detachView()
}