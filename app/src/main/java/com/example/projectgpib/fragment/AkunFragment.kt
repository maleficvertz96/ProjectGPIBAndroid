package com.example.projectgpib.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.projectgpib.R
import com.example.projectgpib.helper.SharedPref
import com.example.projectgpib.activity.LoginActivity
import com.example.projectgpib.MainActivity

class AkunFragment : Fragment() {

    lateinit var s:SharedPref
    lateinit var btnLogout:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_akun, container, false)
        val view: View = inflater.inflate(R.layout.fragment_akun, container, false)
        btnLogout = view.findViewById(R.id.btn_logout)

        s =SharedPref(requireActivity())

        btnLogout.setOnClickListener {
            requireActivity().onBackPressed()
            s.setStatusLogin(false)
        }

        return view
    }
}
