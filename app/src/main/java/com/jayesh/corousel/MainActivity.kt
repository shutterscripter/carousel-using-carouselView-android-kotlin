package com.jayesh.corousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {
    lateinit var cvHome: CarouselView

    private val images: IntArray = intArrayOf(
        R.drawable.red,
        R.drawable.blue,
        R.drawable.green,
        R.drawable.pink,
        R.drawable.yellow,
        R.drawable.purple,
        R.drawable.green_girl,
        R.drawable.gray_girl
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cvHome = findViewById(R.id.cvHome)
        cvHome.pageCount = images.size

        cvHome.setImageListener { position, imageView ->
            imageView.setImageResource(images[position])
        }

//        cvHome.setImageClickListener { index ->
//
//        }

    }
}