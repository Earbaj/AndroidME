package com.example.practice_1

class AndroidImageAssets {

    val heads = mutableListOf<Int>(
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
        R.drawable.head12,
    )

    val bodies = mutableListOf<Int>(
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
        R.drawable.body12,
    )

    val legs = mutableListOf<Int>(
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
        R.drawable.legs12,
    )

    val all = mutableListOf<List<Int>>(
        heads,
        bodies,
        legs
    )

    @JvmName("getHeads1")
    public fun getHeads() : List<Int>{
        return heads
    }

    public fun getBody() : List<Int>{
        return bodies
    }

    public fun getLeg() : List<Int>{
        return legs
    }

    @JvmName("getAll1")
    public fun getAll() : List<Int> {
        return all as List<Int>
    }

}