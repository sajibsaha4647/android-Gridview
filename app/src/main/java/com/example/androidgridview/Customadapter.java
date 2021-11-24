package com.example.androidgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends BaseAdapter {

    String [] countryname;
    int [] flags;
    Context context;
    private LayoutInflater inflater;

    public CustomAdapter(MainActivity mainActivity, String[] countryname, int[] flags) {

        this.context = mainActivity;
        this.flags = flags;
        this.countryname = countryname

    }

    @Override
    public int getCount() {
        return countryname.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
                inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                convertView =  inflater.inflate(R.layout.sample_view,parent,false);

        }
            ImageView imageView = convertView.findViewById(R.id.imageViewId);
            TextView textView = convertView.findViewById(R.id.newsimple);

        return null;
    }
}
