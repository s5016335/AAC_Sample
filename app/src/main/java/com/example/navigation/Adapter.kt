package com.example.navigation

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation.Model.User
import kotlinx.android.synthetic.main.item.view.*
import java.util.*

class Adapter(val data :ArrayList<User>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nane =view.name
        var sex =view.sex

    }

    fun swipe(position: Int){
        data.removeAt(position)
        notifyItemRemoved(position)

    }

    fun onItemMove(fromPosition:Int,toPosition:Int){
        Collections.swap(data,fromPosition,toPosition)
        notifyItemMoved(fromPosition, toPosition)
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Adapter.ViewHolder {

        val  view = LayoutInflater.from(p0.context).inflate(R.layout.item,p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount()=data.size

    override fun onBindViewHolder(p0: Adapter.ViewHolder, position: Int) {

        p0.nane.text=data[position].name
        p0.sex.text=data[position].sex
    }

}