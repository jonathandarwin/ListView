package com.example.user.listview25juli2018;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



/**
 * Created by User on 7/25/2018.
 */

class CustomAdapter extends ArrayAdapter<String> {


    public CustomAdapter(@NonNull Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        // INFLATE THE LIST
        View customView = inflater.inflate(R.layout.custom_row, parent, false);

        // GET THE DATA
        String singleFoodItem = getItem(position);
        TextView txtList = (TextView) customView.findViewById(R.id.txtList);
        ImageView imgJoe = (ImageView) customView.findViewById(R.id.imgJoe);

        // SET DATA TO VIEW
        txtList.setText(singleFoodItem);
        imgJoe.setImageResource(R.drawable.website);

        return customView;
    }
}
