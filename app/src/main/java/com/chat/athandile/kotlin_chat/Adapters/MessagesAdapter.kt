package com.chat.athandile.kotlin_chat.Adapters

import android.view.ViewGroup
import com.chat.athandile.kotlin_chat.ViewHolders.MessageViewHolder
import com.chat.athandile.kotlin_chat.dto.Message
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions

class MessagesAdapter(options: FirestoreRecyclerOptions<Message>) : FirestoreRecyclerAdapter<Message, MessageViewHolder>(options) {



    override fun onBindViewHolder(holder: MessageViewHolder, position: Int, model: Message) {

        holder.bind(model)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}