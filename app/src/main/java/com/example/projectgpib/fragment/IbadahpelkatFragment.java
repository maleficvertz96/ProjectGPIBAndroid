package com.example.projectgpib.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

import com.example.projectgpib.R;


public class IbadahpelkatFragment extends Fragment {

    public IbadahpelkatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ibadahpelkat, container, false);
        WebView webView = (WebView)v.findViewById(R.id.wb_ibadahpelkat);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://192.168.42.30/projectgpib/public/jadwalpelkat/");
        return v;
    }
}