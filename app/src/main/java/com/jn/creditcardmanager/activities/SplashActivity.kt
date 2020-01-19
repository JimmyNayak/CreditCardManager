package com.jn.creditcardmanager.activities

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.jn.creditcardmanager.MainActivity
import com.jn.creditcardmanager.R
import com.jn.creditcardmanager.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.lottie_splash

class SplashActivity : BaseActivity(), AnimatorListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        initComponent()
    }

    override fun onPause() {
        super.onPause()
        lottie_splash.pauseAnimation()
    }

    override fun onResume() {
        super.onResume()
        lottie_splash.playAnimation()
        lottie_splash.speed = 1.5f
    }

    override fun onDestroy() {
        super.onDestroy()
        lottie_splash.cancelAnimation()
    }

    override fun initComponent() {

        lottie_splash.addAnimatorListener(this)
    }

    override fun onAnimationRepeat(animator: Animator?) {
        Log.e("Animation", "repeat")
    }

    override fun onAnimationEnd(animator: Animator?) {

        val intent = Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        }


        startActivity(intent)
    }

    override fun onAnimationCancel(animator: Animator?) {
        Log.e("Animation", "cancel")
    }

    override fun onAnimationStart(animator: Animator?) {
        Log.e("Animation", "start")
    }
}
