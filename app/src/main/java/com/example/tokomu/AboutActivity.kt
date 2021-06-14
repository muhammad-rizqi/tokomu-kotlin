package com.example.tokomu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val profileImage = findViewById<CircleImageView>(R.id.img_profile_photo)
        Glide.with(this)
            .load("https://d17ivq9b7rppb3.cloudfront.net/small/avatar/202012141027304dcec01b7f1e7b42569c70726f95ddb3.png")
            .into(profileImage)

        supportActionBar?.title = "Tentang"
    }
}