package com.jn.creditcardmanager.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import com.jn.creditcardmanager.R

/**
 * Created on 08-09-2019.
 */
class ProgressDialog(context: Context) : Dialog(context) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.window?.requestFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_progress)

        initProgress()
    }

    private fun initProgress() {

        this.setCancelable(false)
        this.setCanceledOnTouchOutside(false)
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }
}