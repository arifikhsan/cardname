package com.example.android.recyclerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.list_layout.view.*


/**
 * Created by Arif Ikhsanudin on Tuesday, 30 October 2018.
 */

class CustomAdapter(
        private val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(), View.OnClickListener {
    override fun onClick(p0: View?) {

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.list_layout, p0, false)
        view.setOnClickListener {
            Toast.makeText(view.context, it.tv_name.text.toString(), Toast.LENGTH_SHORT).show()
        }
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val user: User = userList[p1]
        p0.textViewName.text = user.name
        p0.textViewAddress.text = user.address
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName = itemView.findViewById(R.id.tv_name) as TextView
        val textViewAddress = itemView.findViewById(R.id.tv_address) as TextView
    }


}

