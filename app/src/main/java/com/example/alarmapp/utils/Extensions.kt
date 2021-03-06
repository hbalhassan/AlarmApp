package com.example.alarmapp.utils

import android.content.Context
import android.content.res.Configuration

object Extensions {
    // check if dark theme enabled
    fun Context.isDarkTheme(): Boolean =
        when (this.resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK)) {
            Configuration.UI_MODE_NIGHT_YES -> true
            else -> false
        }

    // get numbers from string
    fun String.snoozeTimeInt() = this.filter { it.isDigit() }.toInt()
}