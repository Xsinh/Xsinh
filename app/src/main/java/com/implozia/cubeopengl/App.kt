package com.implozia.cubeopengl

import android.app.Application
import com.implozia.cubeopengl.di.DI
import com.implozia.cubeopengl.di.module.AppModule
import toothpick.Toothpick

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initAppScope()
    }

    private fun initAppScope() {
        Toothpick.openScope(DI.APP_SCOPE)
            .installModules(
                AppModule(this)
            )
    }
}