package com.example.fauzan.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusikAdapter extends ArrayAdapter<Musik> {


    public MusikAdapter(Activity context, ArrayList<Musik> musikList){
        super(context, 0, musikList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            // LayoutInflater digunakan untuk mendapatkan view layout xml yang
            // nanti nya akan menjadi View Object Java
            listItemView =  LayoutInflater.from(getContext()).inflate(R.layout.row_musik, parent, false);
        }

        Musik musik = getItem(position);

        TextView tvJudul = (TextView) listItemView.findViewById(R.id.tvJudul);
        tvJudul.setText(musik.judul);

        TextView tvArtis = (TextView) listItemView.findViewById(R.id.tvArtis);
        tvArtis.setText(musik.artis);

        return listItemView;
    }
}
