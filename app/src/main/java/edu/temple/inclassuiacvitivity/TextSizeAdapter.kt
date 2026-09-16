package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val numbers: Array<Int>, private val activity: MainActivity) : 
    BaseAdapter() {


    override fun getCount() = numbers.size



    override fun getItem(position: Int) = numbers[position]


    override fun getItemId(position: Int) = position.toLong()


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if (convertView == null)
            textView = TextView(activity)
        else
            textView = (convertView as TextView)
        textView.text = numbers[position].toString()
        return textView
    }

}
