package com.rklambo.bandhits.ui.screens

import android.view.View
import com.rklambo.bandhits.R
import com.rklambo.bandhits.ui.custom.AutofitRecyclerView
import com.rklambo.bandhits.ui.custom.PaddingItemDecoration
import org.jetbrains.anko.*


fun AutofitRecyclerView.style() {
    clipToPadding = false
    columnWidth = dimen(R.dimen.column_width)
    scrollBarStyle = View.SCROLLBARS_OUTSIDE_OVERLAY
    horizontalPadding = dimen(R.dimen.recycler_spacing)
    verticalPadding = dip(2)
    addItemDecoration(PaddingItemDecoration(dip(2)))
}