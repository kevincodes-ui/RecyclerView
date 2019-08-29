package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val itemList: ArrayList<RcvModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val _v = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return ViewHolder(_v)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // get image res images
        holder.avatar.setImageResource(itemList[position].getAvatars())
        // get title
        holder.title.setText(itemList[position].getTitles())
        // get messages
        holder.message.setText(itemList[position].getMessages())
        // get time message is sent at
        holder.sentAt.setText(itemList[position].getSentAts())
    }

    inner class ViewHolder(_view : View) : RecyclerView.ViewHolder(_view){
        var title: TextView
        var message: TextView
        var sentAt: TextView
        var messageState: ImageView
        var avatar: ImageView

        init {

            title = itemView.findViewById(R.id.title) as TextView
            message = itemView.findViewById(R.id.message) as TextView
            sentAt = itemView.findViewById(R.id.sentAt) as TextView
            messageState = itemView.findViewById(R.id.messageState) as ImageView
            avatar = itemView.findViewById(R.id.avatar) as ImageView
        }
    }
}
