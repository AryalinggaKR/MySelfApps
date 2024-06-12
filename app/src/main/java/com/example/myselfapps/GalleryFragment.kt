package com.example.myselfapps
/*
   Tanggal Pengerjaan : 12 Juni 2024
        NIM : 10118368
        Nama : Aryalingga Karamasatya Radhiendra
        Kelas : AKB UL1
*/
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class GalleryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: GalleryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_gallery, container, false)
        recyclerView = rootView.findViewById(R.id.recyclerView)
        adapter = GalleryAdapter(getImageList())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context, 3) // Sesuaikan dengan jumlah kolom yang Anda inginkan
        return rootView
    }

    private fun getImageList(): List<Int> {
        return listOf(
            R.drawable.img01,
            R.drawable.img02,
            R.drawable.img03,
            R.drawable.img04,
            R.drawable.img05,
            R.drawable.img06,
            R.drawable.img07,
            R.drawable.img08,
            R.drawable.img09,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12,
            R.drawable.img13,
            R.drawable.img14,
            R.drawable.img15,
            R.drawable.img16,
            R.drawable.img17,
            R.drawable.img18,
            R.drawable.img19,



        )
    }
}

