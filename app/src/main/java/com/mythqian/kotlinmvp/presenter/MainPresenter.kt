package com.mythqian.kotlinmvp.presenter

import android.util.Log
import com.mythqian.kotlinmvp.contract.MainContract

open class MainPresenter : MainContract.Presenter() {
    override fun btn_request(){
        Log.wtf("sss","ssssssssssss")
    }
}