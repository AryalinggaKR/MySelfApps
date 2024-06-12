package com.example.myselfapps
/*
   Tanggal Pengerjaan : 12 Juni 2024
        NIM : 10118368
        Nama : Aryalingga Karamasatya Radhiendra
        Kelas : AKB UL1
*/
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(private val context: Context, private val musicList: List<MusicItem>) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    inner class MusicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        val videoView: VideoView = itemView.findViewById(R.id.videoView)
        val playPauseButton: ImageButton = itemView.findViewById(R.id.playPauseButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val currentItem = musicList[position]
        holder.titleTextView.text = currentItem.title

        val videoUri = Uri.parse("android.resource://${context.packageName}/${currentItem.videoResId}")
        holder.videoView.setVideoURI(videoUri)

        holder.playPauseButton.setOnClickListener {
            if (holder.videoView.isPlaying) {
                holder.videoView.pause()
                holder.playPauseButton.setImageResource(android.R.drawable.ic_media_play)
            } else {
                holder.videoView.start()
                holder.playPauseButton.setImageResource(android.R.drawable.ic_media_pause)
            }
        }

        holder.videoView.setOnPreparedListener {
            holder.videoView.seekTo(1)
            holder.playPauseButton.setImageResource(android.R.drawable.ic_media_play)
        }

        holder.videoView.setOnCompletionListener {
            holder.playPauseButton.setImageResource(android.R.drawable.ic_media_play)
        }
    }

    override fun getItemCount() = musicList.size
}
