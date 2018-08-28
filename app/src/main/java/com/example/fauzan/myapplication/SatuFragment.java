package com.example.fauzan.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


public class SatuFragment extends Fragment {

    public SatuFragment() {

    }

    private String[] hewan = {"Bebek", "Gajah", "Harimau", "Kucing", "Kuda"};
    private Integer[] gambar = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};
    private ListView lvhewan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_satu, container, false);
        /*View view = inflater.inflate(R.layout.fragment_satu, container, false);

        lvhewan = (ListView)*/

        return inflater.inflate(R.layout.fragment_satu, container, false);
    }
}
