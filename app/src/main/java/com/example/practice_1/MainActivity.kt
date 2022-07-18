package com.example.practice_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Head Fragment
        val headFragment = BodyPartFragment()
        val androidImageAssets = AndroidImageAssets()
        headFragment.setImageIds(androidImageAssets.getHeads())
        headFragment.setListIndex(6)

        var fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .add(R.id.head_container, headFragment)
            .commit()

        //Body Fragment
        val bodyFragment = BodyPartFragment()
        bodyFragment.setImageIds(androidImageAssets.getBody())
        bodyFragment.setListIndex(2)
        fragmentManager.beginTransaction().
        add(R.id.body_container, bodyFragment).
        commit()

        //Leg Fargment
        val legFragment = BodyPartFragment()
        legFragment.setImageIds(androidImageAssets.getLeg())
        legFragment.setListIndex(2)
        fragmentManager.beginTransaction().
        add(R.id.leg_container, legFragment).
        commit()
    }
}