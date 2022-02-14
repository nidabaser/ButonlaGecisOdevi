package com.example.butonlagecisodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.butonlagecisodevi.databinding.ActivityXsayfasiEkraniBinding

class XSayfasiEkraniActivity : AppCompatActivity() {

    private lateinit var tasarim: ActivityXsayfasiEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityXsayfasiEkraniBinding.inflate(layoutInflater)

        setContentView(tasarim.root)

        tasarim.buttonXdenYgit.setOnClickListener {

            val intent = Intent(this@XSayfasiEkraniActivity,YSayfasiEkraniActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}