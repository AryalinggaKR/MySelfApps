package com.example.myselfapps
/*
   Tanggal Pengerjaan : 12 Juni 2024
        NIM : 10118368
        Nama : Aryalingga Karamasatya Radhiendra
        Kelas : AKB UL1
*/
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_profile, container, false)
        val emailIcon = rootView.findViewById<ImageView>(R.id.emailIcon)
        emailIcon.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse("mailto:aryalinggakr@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Halo")
            startActivity(emailIntent)
        }

        val phoneIcon = rootView.findViewById<ImageView>(R.id.phoneIcon)
        phoneIcon.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:087722764955")
            startActivity(intent)
        }

        val instagramIcon = rootView.findViewById<ImageView>(R.id.instagramIcon)
        instagramIcon.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/_u/aryalinggakr"))
            startActivity(intent)
        }

        val mapIcon = rootView.findViewById<ImageView>(R.id.mapIcon)
        mapIcon.setOnClickListener {
            openMapApp()
        }

        return rootView
    }


    private fun openMapApp() {
        val latitude = -6.854167
        val longitude = 107.513167
        val label = "Lokasi Saya"

        val gmmIntentUri = Uri.parse("geo:$latitude,$longitude?q=$latitude,$longitude($label)")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        if (mapIntent.resolveActivity(requireActivity().packageManager) != null) {
            startActivity(mapIntent)
        }
    }

    }
