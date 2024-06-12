package com.example.myselfapps
/*
   Tanggal Pengerjaan : 12 Juni 2024
        NIM : 10118368
        Nama : Aryalingga Karamasatya Radhiendra
        Kelas : AKB UL1
*/
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener)


        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
            HomeFragment()).commit()
    }



    private val navListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val selectedFragment: Fragment = when (item.itemId) {
            R.id.navigation_home -> HomeFragment()
            R.id.navigation_daily_activity -> DailyActivityFragment()
            R.id.navigation_gallery -> GalleryFragment()
            R.id.navigation_music -> MusicFragment()
            R.id.navigation_profile -> ProfileFragment()
            else -> HomeFragment()
        }

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,
            selectedFragment).commit()

        true
    }
}
