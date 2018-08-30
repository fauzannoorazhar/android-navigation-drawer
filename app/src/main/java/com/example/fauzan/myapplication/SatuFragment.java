package com.example.fauzan.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        musikList.add(new Musik("When You Love Someone","Endah N Resha", R.drawable.ic_music));
        musikList.add(new Musik("Cukup Tau","Rizky Febrian", R.drawable.ic_music));
        musikList.add(new Musik("Kau Yang Sembunyi","Hanin Dhiya", R.drawable.ic_music));
        musikList.add(new Musik("I Will Fly","Ten 2 Five", R.drawable.ic_music));
        musikList.add(new Musik("Mata Ke Hati","Hivi", R.drawable.ic_music));

        MusikAdapter musikAdapter = new MusikAdapter(getActivity(), musikList);
        ListView listView = (ListView) view.findViewById(R.id.lvFragmentSatu);
        listView.setAdapter(musikAdapter);

        return view;

        //return inflater.inflate(R.layout.fragment_satu, container, false);
    }
}
