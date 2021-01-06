package com.example.projectgpib.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.projectgpib.R
import com.example.projectgpib.adapter.AdapterMenu
import com.example.projectgpib.adapter.AdapterSlider
import com.example.projectgpib.model.Menu
import kotlinx.android.synthetic.main.fragment_home.*
import kotlin.collections.ArrayList

@Suppress("DEPRECATION")
class HomeFragment : Fragment() {

    lateinit var vpSlider: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //ngatur gambar slide
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vpSlider = view.findViewById(R.id.vp_slider)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vpSlider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val JadwalFragment = JadwalFragment()
        btn_ibadahminggu.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, JadwalFragment, JadwalFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        btn_kegiatan.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, JadwalFragment, JadwalFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        btn_pembinaan.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, JadwalFragment, JadwalFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        btn_donasi.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, JadwalFragment, JadwalFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        btn_keuangan.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, JadwalFragment, JadwalFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        val TentangFragment = TentangFragment()
        btn_tentang.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, TentangFragment, JadwalFragment::class.java.simpleName)
                        .addToBackStack(null)
                        .commit()
            }
        }
    }
}

