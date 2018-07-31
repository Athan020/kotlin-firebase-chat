package com.chat.athandile.kotlin_chat.Adapters

import android.support.v4.app.FragmentManager
import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import com.chat.athandile.kotlin_chat.Fragments.ChatInterface.ChatsFragment
import com.chat.athandile.kotlin_chat.Fragments.ChatInterface.ContactsFragment

 @Suppress("UNUSED_EXPRESSION")
 class TabAdapter(fm:FragmentManager, val context: Context):FragmentPagerAdapter(fm) {

    private val mFragments:Array<Fragment> = arrayOf(ChatsFragment(), ContactsFragment())

    private val mFragmentHeaders:Array<String> = arrayOf("CHATS","CONTACTS")
    override fun getCount(): Int {
      return  mFragments.size
    }

    override fun getItem(position: Int): Fragment {
       return mFragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentHeaders[position]
    }

}