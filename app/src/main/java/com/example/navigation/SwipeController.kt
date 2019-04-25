package com.example.navigation

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper

class SwipeController (val adapter: Adapter): ItemTouchHelper.Callback() {
    override fun getMovementFlags(recyclerView: RecyclerView, p1: RecyclerView.ViewHolder): Int {
        var dragFlags =ItemTouchHelper.UP or ItemTouchHelper.DOWN
        var swipeFlags = ItemTouchHelper.START or ItemTouchHelper.END

        return makeMovementFlags(dragFlags,swipeFlags)
    }

    override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
        adapter.onItemMove(viewHolder.adapterPosition,target.adapterPosition)
        return true
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        adapter.swipe(viewHolder.adapterPosition)
    }
}