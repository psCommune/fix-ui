package com.musicPlayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.musicPlayer.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Информация"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return "Информация о изменениях:" +
                "\n\nБудет добавляться в новых версиях приложения"
    }
}