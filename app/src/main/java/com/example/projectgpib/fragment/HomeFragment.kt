package com.example.projectgpib.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.projectgpib.R
import com.example.projectgpib.adapter.AdapterMenu
import com.example.projectgpib.adapter.AdapterSlider
import com.example.projectgpib.model.Menu
import kotlin.collections.ArrayList

class HomeFragment : Fragment() {

    lateinit var vpSlider: ViewPager
    lateinit var rvMenu:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //ngatur gambar slide
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)
        rvMenu = view.findViewById(R.id.rv_menu)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        rvMenu.adapter = AdapterMenu(arrMenu)
        rvMenu.layoutManager = layoutManager

        return view
    }

    val arrMenu: ArrayList<Menu>get(){
        val arr = ArrayList<Menu>()
        val m1 = Menu()
        m1.nama = "Jadwal Ibadah"
        m1.gambar = R.drawable.church

        val m2 = Menu()
        m2.nama = "Agenda Kegiatan"
        m2.gambar = R.drawable.push_pin

        val m3 = Menu()
        m3.nama = "Jadwal Pembinaan Pelayan"
        m3.gambar = R.drawable.calendar

        val m4 = Menu()
        m4.nama = "Laporan Keuangan"
        m4.gambar = R.drawable.coin

        val m5 = Menu()
        m5.nama = "Penelitian & Pengembangan"
        m5.gambar = R.drawable.graphic

        val m6 = Menu()
        m6.nama = "Hari Ulang Tahun"
        m6.gambar = R.drawable.birthday_cake

        val m7 = Menu()
        m7.nama = "Donasi"
        m7.gambar = R.drawable.donation

        arr.add(m1)
        arr.add(m2)
        arr.add(m3)
        arr.add(m4)
        arr.add(m5)
        arr.add(m6)
        arr.add(m7)


        return arr
    }
}
