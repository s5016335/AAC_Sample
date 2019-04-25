package com.example.navigation

interface ItemController {
    fun swipe(position :Int)

    fun onItemMove(fromPosition:Int,toPosition :Int)
}