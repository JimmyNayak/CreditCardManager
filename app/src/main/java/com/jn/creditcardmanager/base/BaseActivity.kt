package com.jn.creditcardmanager.base

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.jn.creditcardmanager.dialog.ProgressDialog

/**
 * Created on 06-07-2019.
 */
abstract class BaseActivity : AppCompatActivity() {

    var progressDialog: ProgressDialog? = null

    abstract fun initComponent()

    /**
     *  Show progress bar
     */
    fun showProgress(context: Context) {
        if (progressDialog == null) {
            progressDialog = ProgressDialog(context)
        }

        progressDialog?.show()
    }

    /**
     * Hide progress bar
     */
    fun hideProgress() {
        progressDialog?.dismiss()
    }
}
