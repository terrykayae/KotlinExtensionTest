package uk.co.tezk.myapplication

/**
 * Quick and short program to try out Kotlin extensions
 */

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { loadImage() }
    }

    fun loadImage() {
        val myUrl = editText.text.toString()

        // Extension added to imageview in util.kt to allow loading images from URL
        myImageView.loadUrl(myUrl)
    }

}


