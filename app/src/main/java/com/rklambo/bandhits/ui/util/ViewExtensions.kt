package com.rklambo.bandhits.ui.util

import android.os.Build
import android.support.annotation.LayoutRes
import android.support.annotation.StyleRes
import android.support.v4.widget.TextViewCompat
import android.text.Html
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.rklambo.bandhits.ui.adapter.SingleClickListener
import com.squareup.picasso.Picasso
import org.jetbrains.anko.layoutInflater

/**
 * Click listener setter that prevents double click on the view it's set
 */
fun View.singleClick(l: (android.view.View?) -> Unit) {
    setOnClickListener(SingleClickListener(l))
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return context.layoutInflater.inflate(layoutRes, this, attachToRoot)
}

fun ImageView.loadUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}

fun TextView.setTextAppearanceC(@StyleRes textAppearance: Int)
        = TextViewCompat.setTextAppearance(this, textAppearance)

@Suppress("DEPRECATION")
fun String.fromHtml() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
    Html.fromHtml(this, Html.FROM_HTML_MODE_COMPACT);
} else {
    Html.fromHtml(this)
}