package com.example.myselfapps
/*
   Tanggal Pengerjaan : 12 Juni 2024
        NIM : 10118368
        Nama : Aryalingga Karamasatya Radhiendra
        Kelas : AKB UL1
*/
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DailyActivityFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ActivityAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_daily_activity, container, false)
        recyclerView = rootView.findViewById(R.id.recyclerViewActivities)
        adapter = ActivityAdapter(getSampleActivities()) // Ganti dengan aktivitas Anda yang sebenarnya
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        val recyclerViewFriendList: RecyclerView = rootView.findViewById(R.id.recyclerViewFriendList)
        val friendListAdapter = FriendListAdapter(getSampleFriends())
        recyclerViewFriendList.adapter = friendListAdapter
        recyclerViewFriendList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        return rootView
    }

    private fun getSampleActivities(): List<ActivityItem> {
        return listOf(
            ActivityItem("Bangun", "Bangun jam 4.00-6.00 pagi"),
            ActivityItem("Sarapan", "Sarapan jam 5 Jika ada Kelas, jam 8-10 kalo santai"),
            ActivityItem("Berangkat", "Kalo ada kelas berangkat 1 jam sebelum kelas masuk"),
            ActivityItem("Antar Jemput", "Setiap Senin-Jumat nganter adik jam 6 jika ada kelas, kalo nggak sesudah adik selesai makan. Jemput sekolahnya jam 14.30"),
            ActivityItem("Makan Siang", "Makan siang biasa jam 13.00 siang atau 15.00-16.00 sore"),
            ActivityItem("Masak", "Masak nasi untuk makan malam jam 18.00"),
            ActivityItem("Makan Malam", "Makan malam jam 19.00-21.00"),
            ActivityItem("Waktu Kosong/Santai", "Main Game"),
            ActivityItem("Tidur", "Tidur kalo capek jam 22.00 maksimal, kalo tidak bisa tidur jam 3.00 paling telat")
        )
    }

    private fun getSampleFriends(): List<FriendItem> {
        return listOf(
            FriendItem("Haekal", R.drawable.friends),
            FriendItem("Panji", R.drawable.friends),
            FriendItem("Adnan", R.drawable.friends),
            FriendItem("Rizki", R.drawable.friends),
            FriendItem("Daffa", R.drawable.friends),
            FriendItem("Rafie", R.drawable.friends),

        )
    }
}
