package com.jayesh.corousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        //setting images
        cvHome.setImageListener { position, imageView ->
            imageView.setImageResource(images[position])
        }

        //onClickListener for images
        cvHome.setImageClickListener { index -> //TODO: work to when user click on images
            when(index){
                0-> Toast.makeText(this, "image01", Toast.LENGTH_SHORT).show()
            }
        }

    }
}