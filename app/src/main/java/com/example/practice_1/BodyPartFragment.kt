package com.example.practice_1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.practice_1.AndroidImageAssets

class BodyPartFragment() : Fragment() {

    var mImageIds : List<Int>? = null
    var mListIndex : Int = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val assets = AndroidImageAssets()
        var rootView = inflater.inflate(R.layout.fragment_body_part, container, false)
        var imageView = rootView.findViewById<ImageView>(R.id.body_part_image_view)
        //imageView.setImageResource(assets.getHeads().get(mListIndex))
        if (mImageIds != null){
            imageView.setImageResource(mImageIds!!.get(mListIndex))
            imageView.setOnClickListener {

            }
        }else {
            Log.v("TAG", "This Fragment has null list of id's")
        }
        return rootView
    }

    fun setImageIds(imageIds : List<Int>){
        mImageIds = imageIds
    }
    fun setListIndex(index : Int){
        mListIndex = index
    }
}