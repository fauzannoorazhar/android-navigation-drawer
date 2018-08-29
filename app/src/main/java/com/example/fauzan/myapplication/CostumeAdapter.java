package com.example.fauzan.myapplication;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CostumeAdapter extends ArrayAdapter<Musik> {
    private String[] judul;
    private String[] artis;
    private Integer[] gambar;
    private Activity activity;

    public CostumeAdapter(Activity context, ArrayList<Musik> musikList){
        super(context, 0, musikList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.row_musik, parent, false);
        }

        Musik musik = getItem(position);

        return listItemView;
    }
}
