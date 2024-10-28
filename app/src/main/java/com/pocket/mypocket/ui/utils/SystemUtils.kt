package com.pocket.mypocket.ui.utils

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.WindowInsetsController

fun Activity.changeStatusBarTextColor(isDark: Boolean) {

    if (Build.VERSION.SDK_INT < 30) {
        val decorView = this.window.decorView
        if (isDark) {
            decorView.systemUiVisibility =
                decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        } else {
            decorView.systemUiVisibility =
                decorView.systemUiVisibility and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
        }
    } else {
        val windowInsetsController = this.window.insetsController

        if (windowInsetsController != null) {
            if (isDark) {
                // Enable light status bar text
                windowInsetsController.setSystemBarsAppearance(
                    WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                    WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                )
            } else {
                // Disable light status bar text
                windowInsetsController.setSystemBarsAppearance(
                    0,
                    WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                )
            }
        }
    }
}