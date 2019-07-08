package com.mythqian.kotlinmvp

import com.alibaba.android.arouter.launcher.ARouter
import com.mythqian.lib_common.base.BaseApplication
import com.mythqian.lib_common.util.ConstantUtils

class App :BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        initARouter()
    }

    fun initARouter(){
        if (ConstantUtils.isAppDebug()) {
            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug()
            ARouter.openLog()
        }
        ARouter.init(this)
    }
}