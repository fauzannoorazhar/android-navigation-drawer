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

import java.util.ArrayList;


public class SatuFragment extends Fragment {

    private String[] judul = {"Dekat Di Hati", "When You Love Someone", "Cukup Tau", "Pupus", "I Will Fly", "Mata Ke Hati"};
    private String[] artis = {"Ran", "Endah N Resha", "Rizky Febrian", "Hanin Dhiya", "Ten 2 Five", "Hivi"};
    private Integer[] gambar = {R.drawable.ic_music, R.drawable.ic_music, R.drawable.ic_music, R.drawable.ic_music, R.drawable.ic_music, R.drawable.ic_music};

    public SatuFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_satu, container, false);

        View view = inflater.inflate(R.layout.fragment_satu, null);

        ArrayList<Musik> musikList = new ArrayList<Musik>();
        musikList.add(new Musik("Dekat Di Hati","Ran", R.drawable.ic_music));
        musikList.add(new Musik("Dekat Di Hati","Endah N Resha", R.drawable.ic_music));
        musikList.add(new Musik("Dekat Di Hati","Rizky Febrian", R.drawable.ic_music));
        musikList.add(new Musik("Dekat Di Hati","Hanin Dhiya", R.drawable.ic_music));
        musikList.add(new Musik("Dekat Di Hati","Ten 2 Five", R.drawable.ic_music));
        musikList.add(new Musik("Dekat Di Hati","Hivi", R.drawable.ic_music));

        CostumeAdapter costumeAdapter = new CostumeAdapter(getActivity(), musikList);
        ListView listView = (ListView) view.findViewById(R.id.lvFragmentSatu);
        listView.setAdapter(costumeAdapter);

        return view;

        //return inflater.inflate(R.layout.fragment_satu, container, false);
    }
}
