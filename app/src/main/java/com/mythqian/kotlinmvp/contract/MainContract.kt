package com.mythqian.kotlinmvp.contract

import com.mythqian.lib_common.base.BasePresenter
import com.mythqian.lib_common.base.IBaseView

interface MainContract {
    interface View : IBaseView
    abstract class Presenter : BasePresenter<View>(){

    }
}