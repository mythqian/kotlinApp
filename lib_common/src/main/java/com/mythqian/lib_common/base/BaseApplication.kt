package com.mythqian.lib_common.base

import android.app.Application
import com.mythqian.lib_common.util.ConstantUtils

open class BaseApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        ConstantUtils.init(this)
        //TODO：启动优化
    }
}