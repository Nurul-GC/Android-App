/*
 * Copyright (c) 2021 Windscribe Limited.
 */

package com.windscribe.test

import com.windscribe.vpn.Windscribe
import com.windscribe.vpn.di.ApplicationComponent
import com.windscribe.vpn.di.ApplicationTestModule
import com.windscribe.vpn.di.DaggerApplicationTestComponent

class TestApplication : Windscribe() {
    override fun getApplicationModuleComponent(): ApplicationComponent {
        return DaggerApplicationTestComponent.builder()
            .applicationTestModule(ApplicationTestModule(this))
            .build()
    }
}