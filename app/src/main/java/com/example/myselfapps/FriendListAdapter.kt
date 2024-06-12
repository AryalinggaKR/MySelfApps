package com.example.myselfapps
/*
   Tanggal Pengerjaan : 12 Juni 2024
        NIM : 10118368
        Nama : Aryalingga Karamasatya Radhiendra
        Kelas : AKB UL1
*/
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FriendListAdapter(private val friends: List<FriendItem>) :
    RecyclerView.Adapter<FriendListAdapter.FriendViewHolder>() {

    inner class FriendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.textViewName)
        val imageView: ImageView = itemView.findViewById(R.id.imageViewFriend)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_friend, parent, false)
        return FriendViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        val currentItem = friends[position]
        holder.nameTextView.text = currentItem.name
        holder.imageView.setImageResource(currentItem.imageDrawableId)
    }

    override fun getItemCount() = friends.size
}
