/*
   Tanggal Pengerjaan : 12 Juni 2024
        NIM : 10118368
        Nama : Aryalingga Karamasatya Radhiendra
        Kelas : AKB UL1
*/
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import com.example.myselfapps.MainActivity
import com.example.myselfapps.R

class WalkthroughPagerAdapter(private val context: Context, private val viewPager: androidx.viewpager.widget.ViewPager) : PagerAdapter() {

    private val images = intArrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3
    )

    private val texts = arrayOf(
        "Tekan tombol skip untuk melewati walktrough ini.",
        "Aplikasi ini menampilkan beberapa informasi tentang diri saya.",
        "Tekan tombol skip untuk melanjutkan ke halaman utama."
    )

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = inflater.inflate(R.layout.item_walkthrough, container, false)

        val imageView = view.findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(images[position])

        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = texts[position]

        val btnSkip = view.findViewById<Button>(R.id.btnSkip)

        btnSkip.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
            (context as AppCompatActivity).finish()
        }

        container.addView(view)
        return view
    }

    override fun getCount(): Int {
        return images.size // Jumlah halaman
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
