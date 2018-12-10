package com.rklambo.bandhits.ui.adapter

import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.ImageView
import android.widget.TextView
import com.rklambo.bandhits.R
import com.rklambo.bandhits.ui.activity.ViewAnkoComponent
import com.rklambo.bandhits.ui.custom.squareImageView
import com.rklambo.bandhits.ui.entity.ImageTitle
import com.rklambo.bandhits.ui.util.loadUrl
import com.rklambo.bandhits.ui.util.setTextAppearanceC
import org.jetbrains.anko.*

class ImageTitleAdapter(listener: (ImageTitle) -> Unit)
    : BaseAdapter<ImageTitle, ImageTitleAdapter.Component>(listener) {

    override val bind: Component.(item: ImageTitle) -> Unit = { item ->
        title.text = item.name
        item.url?.let { image.loadUrl(it) }
    }

    override fun onCreateComponent(parent: RecyclerView) = Component(parent)

    fun findPositionById(id: String): Int = items.withIndex().first { it.value.id == id }.index

    class Component(override val view: RecyclerView) : ViewAnkoComponent<RecyclerView> {

        lateinit var title: TextView
        lateinit var image: ImageView

        override fun createView(ui: AnkoContext<RecyclerView>) = with(ui) {
            frameLayout {

                verticalLayout {

                    image = squareImageView {
                        scaleType = ImageView.ScaleType.CENTER_CROP
                        backgroundResource = R.color.cardview_dark_background
                    }
                    title = textView {
                        padding = dip(16)
                        backgroundResource = R.color.cardview_dark_background
                        setTextAppearanceC(R.style.TextAppearance_AppCompat_Subhead_Inverse)
                        maxLines = 1
                        ellipsize = TextUtils.TruncateAt.END
                    }.lparams(width = matchParent)

                }.lparams(width = matchParent)

            }
        }
    }
}

