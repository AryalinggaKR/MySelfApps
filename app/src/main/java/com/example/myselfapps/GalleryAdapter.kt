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
import androidx.recyclerview.widget.RecyclerView

class GalleryAdapter(private val imageList: List<Int>) :
    RecyclerView.Adapter<GalleryAdapter.ImageViewHolder>() {

    inner class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageResId = imageList[position]
        holder.imageView.setImageResource(imageResId)
    }

    override fun getItemCount() = imageList.size
}
