package com.example.projectgpib.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.example.projectgpib.R
import com.example.projectgpib.adapter.AdapterSlider
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
        val IbadahmingguFragment = IbadahmingguFragment()
        btn_ibadahminggu.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, IbadahmingguFragment, IbadahmingguFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        val IbadahpelkatFragment = IbadahpelkatFragment()
        btn_pelkat.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, IbadahpelkatFragment, IbadahpelkatFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        val KebaktianFragment = KebaktianFragment()
        btn_kebaktian.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, KebaktianFragment, KebaktianFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        val KegiatanFragment = KegiatanFragment()
        btn_kegiatan.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, KegiatanFragment, KegiatanFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        val PenerimaanFragment = PenerimaanFragment()
        btn_income.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, PenerimaanFragment, PenerimaanFragment::class.java.simpleName)
                    .addToBackStack(null)
                    .commit()
            }
        }

        val TentangFragment = TentangFragment()
        btn_tentang.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, TentangFragment, TentangFragment::class.java.simpleName)
                        .addToBackStack(null)
                        .commit()
            }
        }

        val PembinaanFragment = PembinaanFragment()
        btn_pembinaan.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, PembinaanFragment, PembinaanFragment::class.java.simpleName)
                        .addToBackStack(null)
                        .commit()
            }
        }

        val TransaksiFragment = TransaksiFragment()
        btn_transaksi.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, TransaksiFragment, TransaksiFragment::class.java.simpleName)
                        .addToBackStack(null)
                        .commit()
            }
        }

//        val HutFragment = HutFragment()
//        btn_hut.setOnClickListener {
//            fragmentManager?.beginTransaction()?.apply {
//                replace(R.id.container, HutFragment, HutFragment::class.java.simpleName)
//                    .addToBackStack(null)
//                    .commit()
//            }
//        }

        val PengeluaranFragment = PengeluaranFragment()
        btn_outcome.setOnClickListener {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, PengeluaranFragment, PengeluaranFragment::class.java.simpleName)
                        .addToBackStack(null)
                        .commit()
            }
        }
    }
}

