package com.dvinfotech.listview_app5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class dhruv extends ArrayAdapter<String>
{
    private String[] arr;
    public dhruv(@NonNull Context context, int resource, @NonNull String[] arr)
    {
        super(context, resource, arr);
        this.arr = arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.main_dhruv_layout_res, parent, false);
        TextView t = convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
        return convertView;
    }
}
