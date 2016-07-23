package com.celebria.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.celebria.R;

/**
 * Created by mitesh on 9/7/16.
 */
public class AdapterActiveTrivia extends BaseAdapter{

    private Context context;
    private LayoutInflater inflater;

    public AdapterActiveTrivia(Context context){

        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View row = convertView;
        if (convertView == null) {
            row = inflater.inflate(R.layout.row_active_trivia, viewGroup, false);
        }
        return row;
    }
}
