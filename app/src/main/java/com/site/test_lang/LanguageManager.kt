package com.site.test_lang

import android.content.Context
import android.widget.Toast
import java.util.*

class LanguageManager(private val ct: Context) {
    fun updateResouce(code: String?) {
        val locale = Locale(code)
//        Toast.makeText(ct, "test locale $locale $code", Toast.LENGTH_SHORT).show()
        Locale.setDefault(locale)
        val resources = ct.resources
        val configuration = resources.configuration
//        configuration.locale = locale
        configuration.setLocale(locale)
        resources.updateConfiguration(configuration, resources.displayMetrics)
    }
}

