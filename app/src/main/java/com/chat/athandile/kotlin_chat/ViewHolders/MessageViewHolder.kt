package com.chat.athandile.kotlin_chat.ViewHolders


import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import com.chat.athandile.kotlin_chat.dto.Message
import kotlinx.android.synthetic.main.chats_item.view.*

class MessageViewHolder( itemView: View?): RecyclerView.ViewHolder(itemView) {

    fun bind(message: Message?){

        Glide.with(itemView.context)
                .load(message?.profileImageUrl)
                .into(itemView.profile_image)

        itemView.Name.text = message?.name
        itemView.time_stamp.text = message?.TimeStamp.toString();

        itemView.messageSnippet.text = message?.body

    }
}
