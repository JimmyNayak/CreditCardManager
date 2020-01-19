package com.jn.creditcardmanager

import android.os.Bundle
import android.os.Handler
import com.jn.creditcardmanager.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponent()
    }

    override fun initComponent() {
        showProgress(this)

        Handler().postDelayed({ hideProgress() }, 5000)
    }
}
