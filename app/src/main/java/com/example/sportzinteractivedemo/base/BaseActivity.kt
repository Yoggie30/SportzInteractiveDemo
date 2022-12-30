package com.example.sportzinteractivedemo.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.sportzinteractivedemo.R
import com.example.sportzinteractivedemo.util.CustomProgressDialogue
import com.example.sportzinteractivedemo.util.CustomProgressManager
import com.google.android.material.dialog.MaterialAlertDialogBuilder

abstract class BaseActivity : AppCompatActivity() {

    var isProgressVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(backVisible())
        supportActionBar?.title = setTitle()
        setContentView(getLayoutResource())
    }

    abstract fun getLayoutResource(): Int

    /**
     * show back
     * @return true:visible false:hidden
     */
    open fun backVisible(): Boolean {
        return true
    }

    open fun setTitle(): String {
        return resources.getString(R.string.app_name)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            finish()
        } else {
            super.onBackPressed()
        }
    }

    open fun hideProgress() {
        if (isProgressVisible) {
            CustomProgressManager.dialog.dismiss()
            isProgressVisible = false
        }
    }

    open fun showProgress() {
        if (!isProgressVisible) {
            CustomProgressManager.dialog.show(
                this.supportFragmentManager,
                CustomProgressDialogue.TAG
            )
            isProgressVisible = true
        }
    }

    open fun showAlert(message: String) {
        MaterialAlertDialogBuilder(this)
            .setTitle(R.string.app_name)
            .setMessage(message)
            .setPositiveButton(resources.getString(R.string.label_ok)) { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}