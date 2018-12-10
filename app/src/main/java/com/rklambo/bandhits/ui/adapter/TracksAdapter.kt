package com.rklambo.bandhits.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.widget.TextView
import com.rklambo.bandhits.ui.activity.ViewAnkoComponent
import com.rklambo.bandhits.ui.entity.TrackDetail
import org.jetbrains.anko.*

class TracksAdapter : BaseAdapter<TrackDetail, TracksAdapter.Component>() {

    private val timeStampPattern = "%d:%02d"
    private val timeSystemBaseNumber = 60

    override val bind: Component.(item: TrackDetail) -> Unit = { item ->
        number.text = item.number.toString()
        name.text = item.name
        length.text = secondsToTrackDurationString(item)
    }

    private fun secondsToTrackDurationString(item: TrackDetail): String {
        val fullMinutes = item.duration / timeSystemBaseNumber
        val restSeconds = item.duration % timeSystemBaseNumber
        val trackLength = String.format(timeStampPattern, fullMinutes, restSeconds)
        return trackLength
    }

    override fun onCreateComponent(parent: RecyclerView) = Component(parent)

    class Component(override val view: RecyclerView) : ViewAnkoComponent<RecyclerView> {

        lateinit var number: TextView
        lateinit var name: TextView
        lateinit var length: TextView

        override fun createView(ui: AnkoContext<RecyclerView>) = with(ui) {

            linearLayout {

                lparams(width = matchParent)

                padding = dip(16)
                weightSum = 1f

                number = textView {
                    minEms = 2
                    gravity = Gravity.END
                }

                name = textView{
                    horizontalPadding = dip(16)
                }.lparams(width = 0){
                    weight = 1f
                }

                length = textView()

            }.applyRecursively { view ->
                when (view) {
                    is TextView -> view.textSize = 16f
                }
            }

        }
    }
}