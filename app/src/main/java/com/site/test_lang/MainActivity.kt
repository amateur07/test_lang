package com.site.test_lang
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        //var lang_m = LanguageManager(this)
        btn1.setOnClickListener {
            Toast.makeText(applicationContext, "New locale en", Toast.LENGTH_SHORT).show()
            setAppLocale("en")
            recreate()
        }
        btn2.setOnClickListener {
            Toast.makeText(applicationContext, "New locale de", Toast.LENGTH_SHORT).show()
            setAppLocale("de")
           recreate()
        }

    }

    fun setAppLocale(language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val config = resources.configuration
        config.locale = locale
        this.resources.updateConfiguration(config, resources.displayMetrics)
    }

}