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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MusicFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MusicAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_music, container, false)
        recyclerView = rootView.findViewById(R.id.recyclerViewMusic)
        adapter = MusicAdapter(requireContext(), getMusicList())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        return rootView
    }

    private fun getMusicList(): List<MusicItem> {
        return listOf(
            MusicItem("Toxic City - System of a Down", R.raw.toxiccity_soad),
            MusicItem("Monody - TheFatRat", R.raw.monody_tfr),
            MusicItem("Moon Halo - HOYO-MiX", R.raw.moonhalo),
        )
    }
}
