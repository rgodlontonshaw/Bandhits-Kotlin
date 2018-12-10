package com.rklambo.bandhits.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.rklambo.bandhits.ui.activity.ViewAnkoComponent
import com.rklambo.bandhits.ui.util.singleClick
import kotlin.properties.Delegates

abstract class BaseAdapter<Item, Component : ViewAnkoComponent<RecyclerView>>(
    private val listener: (Item) -> Unit = {}
) :
    RecyclerView.Adapter<BaseAdapter.BaseViewHolder<Component>>() {

    abstract val bind: Component.(item: Item) -> Unit

    var items: List<Item> by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }

    abstract fun onCreateComponent(parent: RecyclerView): Component

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Component> {
        return BaseViewHolder(onCreateComponent(parent as RecyclerView))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Component>, position: Int) {
        val item = items[position]
        holder.itemView.singleClick { listener(item) }
        holder.ui.bind(item)
    }

    override fun getItemCount() = items.size

    class BaseViewHolder<out Component : ViewAnkoComponent<RecyclerView>>(val ui: Component) :
        RecyclerView.ViewHolder(ui.inflate())
}