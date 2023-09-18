package com.example.androidme.data

import com.example.androidme.R

object ListOfImages {

    // list of head images
    private val heads = listOf(
        R.drawable.head1,
        R.drawable.head2,
        R.drawable.head3,
        R.drawable.head4,
        R.drawable.head5,
        R.drawable.head6,
        R.drawable.head7,
        R.drawable.head8,
        R.drawable.head9,
        R.drawable.head10,
        R.drawable.head11,
        R.drawable.head12
    )
    // list of body images
    private val bodies = listOf(
        R.drawable.body1,
        R.drawable.body2,
        R.drawable.body3,
        R.drawable.body4,
        R.drawable.body5,
        R.drawable.body6,
        R.drawable.body7,
        R.drawable.body8,
        R.drawable.body9,
        R.drawable.body10,
        R.drawable.body11,
        R.drawable.body12
    )
    // list of legs images
    private val legs = listOf(
        R.drawable.legs1,
        R.drawable.legs2,
        R.drawable.legs3,
        R.drawable.legs4,
        R.drawable.legs5,
        R.drawable.legs6,
        R.drawable.legs7,
        R.drawable.legs8,
        R.drawable.legs9,
        R.drawable.legs10,
        R.drawable.legs11,
        R.drawable.legs12
    )

    // all 3 images in a single list
    private val all: List<Int> = (heads + bodies + legs)


    // custome getter value to get images
    fun getHeads(): List<Int> {
        return heads
    }

    fun getBodies(): List<Int> {
        return bodies
    }

    fun getLegs(): List<Int> {
        return legs
    }

    fun getAll(): List<Int> {
        return all
    }
}