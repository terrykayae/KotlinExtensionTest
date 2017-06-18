package uk.co.tezk.myapplication

import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by tezk on 16/06/17.
 */

fun ImageView.loadUrl(url : String) {
    Picasso.with(context).load(url).into(this)
}