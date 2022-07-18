package com.example.practice_1

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class MasterListAdapter(var mContext: Context, var mImageIds: List<Int>) : BaseAdapter() {


    override fun getCount(): Int {
        TODO("Not yet implemented")
        return mImageIds.size
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        TODO("Not yet implemented")
        return 0
    }

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        TODO("Not yet implemented")
        var imageView:ImageView
        if(convertView == null){
            imageView = ImageView(mContext)
            imageView.adjustViewBounds = true
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(8,8,8,8)
        }else{
            imageView = convertView as ImageView
        }

        imageView.setImageResource(mImageIds.get(position))
        return  imageView
    }
}