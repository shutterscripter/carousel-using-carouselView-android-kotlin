
# Carousel using caroselView | android | kotlin

A component to show the users a slideshow of images.

# Preview

![App Screenshot](resource/example.gif)

# Dependencies

synnapps library

	implementation 'com.synnapps:carouselview:0.1.4'
	
# XML uses

	<com.synnapps.carouselview.CarouselView
        android:id="@+id/cvHome"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:autoPlay="false"
        app:fillColor="@color/black"
        app:pageColor="@color/white"
        app:radius="4dp"
        app:slideInterval="5000"
        app:strokeColor="@color/trans"
        app:strokeWidth="1dp" />


## XML Details

| Properties  | Information |
| ------------- | ------------- |
| com.synnapps.carouselview.CarouselView  | A View name to show the carousel. It can be written only after adding the dependency above.  |
| app:radius  | A property to choose the circle’s size.|
| app:fillColor  | A property name to choose the fill color for the circle to show which image position is shown.|
| app:slideInterval  | A property to choose the time interval before moving the next image.  |
| app:strokeColor  | A property to choose the stroke color of the circle.  |
| app:strikeWidth  | A property name to choose the width of the circle.  |
| app:autoPlay | Property decide whether carousel animation autoPlay or not.|



# Activity uses
Creating array for images :

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
    
Setting number of images :

         cvHome.pageCount = images.size

Setting images with respective imageView :

       cvHome.setImageListener { position, imageView ->
            imageView.setImageResource(images[position])
        }

Setting Click Listener on images :        

        cvHome.setImageClickListener { index -> //TODO: work to when user click on images
            when(index){
                0-> Toast.makeText(this, "image01", Toast.LENGTH_SHORT).show()
            }
        }
# Methods


| Method | Description |  
| :-------- | :------- | 
| `pageCount` | `For number of views of images wants to add` |  
| `setImageListener` | `set images to corresponding views` |
| `setImageClickListener` | `set click Listeners to corresponding Images` |


# Inspired From

 - [sayyam](https://github.com/sayyam/carouselview)

# Author

- [@Jayesh Shinde](https://github.com/jayesh2272001)
