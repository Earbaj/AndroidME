package com.example.androidme.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.androidme.R

class FragmentBodyPart : Fragment() {

    // Tag for logging
    private val TAG = "BodyPartFragment"

    // empty list and variable to store images and index
    private var mImageIds: List<Int>? = null
    private var mListIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_body_part, container, false)

        val imageView = rootView.findViewById<ImageView>(R.id.body_part_frg)

        if(mImageIds != null){
            // Set the image resource to the list item at the stored index
            imageView.setImageResource(mImageIds!!.get(mListIndex));

            imageView.setOnClickListener {
                if(mListIndex < mImageIds!!.size -1) {
                    mListIndex++;
                } else {
                    // The end of list has been reached, so return to beginning index
                    mListIndex = 0;
                }
                imageView.setImageResource(mImageIds!!.get(mListIndex));
            }
        } else {
            Log.v(TAG, "This fragment has a null list of image id's");
        }

        return rootView
    }

    // Setter methods for keeping track of the list images this fragment can display and which image
    // in the list is currently being displayed

    fun setImageIds(imageIds: List<Int>) {
        mImageIds = imageIds
    }

    fun setListIndex(index: Int) {
        mListIndex = index
    }

}