package com.example.practice_1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.practice_1.AndroidImageAssets
import java.util.ArrayList

class BodyPartFragment() : Fragment() {

    //Id's for onsavedInstanceState
    var IMAGE_ID_LIST : String = "image_ids"
    var LIST_INDEX : String = "list_index"

    //Variable for image and listindex
    var mImageIds : List<Int>? = null
    var mListIndex : Int = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (savedInstanceState != null){
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST)
            mListIndex = savedInstanceState.getInt(LIST_INDEX)
        }

        val assets = AndroidImageAssets()
        var rootView = inflater.inflate(R.layout.fragment_body_part, container, false)
        var imageView = rootView.findViewById<ImageView>(R.id.body_part_image_view)
        //imageView.setImageResource(assets.getHeads().get(mListIndex))
        if (mImageIds != null){
            imageView.setImageResource(mImageIds!!.get(mListIndex))
            imageView.setOnClickListener {
                if(mListIndex < mImageIds!!.size-1){
                    mListIndex++
                }else{
                    mListIndex = 1
                }
                imageView.setImageResource(mImageIds!!.get(mListIndex))
            }
        }else {
            Log.v("TAG", "This Fragment has null list of id's")
        }
        return rootView
    }

    //Setters for Image ids and index
    fun setImageIds(imageIds : List<Int>){
        mImageIds = imageIds
    }
    fun setListIndex(index : Int){
        mListIndex = index
    }

    //Save the current state of fragment
    override fun onSaveInstanceState(currentState: Bundle) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, mImageIds as ArrayList<Int>?)
        currentState.putInt(LIST_INDEX, mListIndex)
    }
}