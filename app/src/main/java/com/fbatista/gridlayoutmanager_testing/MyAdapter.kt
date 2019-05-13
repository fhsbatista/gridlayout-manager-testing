package com.fbatista.gridlayoutmanager_testing

import android.support.v7.widget.RecyclerView
import android.view.InflateException
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item.view.*
import java.util.zip.Inflater

/**
 * Created by Fernando Batista on 13/05/19.
 */

class MyAdapter(var list: List<TestingItem>) : RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ItemViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item, p0, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            holder.bind(list[position])
    }

    inner class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: TestingItem) {
            view.nameTv.text = item.name
            view.ageTv.text = item.age.toString()
        }

    }

}