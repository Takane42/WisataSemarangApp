package com.example.zzzlistwisata

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wisata_detail)

        val title = intent.getStringExtra("title") ?: "No Title"
        val description = intent.getStringExtra("description") ?: "No Description"
        val imageResId = intent.getIntExtra("imageResId", 0)

        findViewById<ImageView>(R.id.imageWisata).setImageResource(imageResId)
        findViewById<TextView>(R.id.titleWisata).text = title
        findViewById<TextView>(R.id.descriptionWisata).text = description
    }
}
