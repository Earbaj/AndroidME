package com.example.androidme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidme.data.ListOfImages
import com.example.androidme.ui.FragmentBodyPart

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            // Create a new head BodyPartFragment
            val headFragment = FragmentBodyPart()
            // Set the list of image id's for the head fragment and set the position to the second image in the list
            headFragment.setImageIds(ListOfImages.getHeads())
            headFragment.setListIndex(1)
            // Add the fragment to its container using a FragmentManager and a Transaction
            val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit()

            // creat new body part fargment and add to it's container using a FragmentManager and a Transaction
            val bodyFragment = FragmentBodyPart()
            bodyFragment.setImageIds(ListOfImages.getBodies())
            bodyFragment.setListIndex(1)
            fragmentManager.beginTransaction()
                .add(R.id.body_container, bodyFragment)
                .commit()

            // creat new leg part fargment and add to it's container using a FragmentManager and a Transaction
            val legFragment = FragmentBodyPart()
            legFragment.setImageIds(ListOfImages.getLegs())
            legFragment.setListIndex(1)
            fragmentManager.beginTransaction()
                .add(R.id.leg_container, legFragment)
                .commit()

        }

    }
}