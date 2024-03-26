package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

    public class MyListAdapter extends BaseAdapter {

        private Context mContext;
        private ArrayList<LinkObject> myList;


        public MyListAdapter(Context context, ArrayList e) {
            this.mContext = context;
            this.myList = e;

        }

        @Override
        public int getCount() {
            return myList.size();
        }

        @Override
        public Object getItem(int i) {
            return myList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        // "i" is the position in the list you are in. This gets what you are lookin for out of the list.
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            LinkObject row = (LinkObject) getItem(i);
            View newView = view;
            TextView textView;
            newView = inflater.inflate(R.layout.favourites_list_adapter, viewGroup, false);

            textView = newView.findViewById(R.id.title);
            textView.setText(row.getTitle());
            textView = newView.findViewById(R.id.link);
            textView.setText(row.getLink());
            textView = newView.findViewById(R.id.description);
            textView.setText(row.getDescription());
            textView = newView.findViewById(R.id.date);
            textView.setText(row.getDate());
            return newView;

        }
    }

