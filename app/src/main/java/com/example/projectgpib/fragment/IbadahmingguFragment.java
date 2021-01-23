package com.example.projectgpib.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.projectgpib.R;


public class IbadahmingguFragment extends Fragment {

    public IbadahmingguFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ibadahminggu, container, false);
        WebView webView = (WebView)v.findViewById(R.id.wb_ibadahminggu);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://192.168.1.7/projectgpib/public/ibadahhariminggu/");
        return v;
    }
}