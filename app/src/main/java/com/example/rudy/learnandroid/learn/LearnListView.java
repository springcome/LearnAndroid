package com.example.rudy.learnandroid.learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.rudy.learnandroid.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListView extends AppCompatActivity {
    private static String [] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
    private static String [] age = {"10", "20", "15", "25", "31", "11", "15", "20", "19"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_list_view);


        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(new CustomAdapter());
    }

    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = getLayoutInflater().inflate(R.layout.custom_item_layout, null);
            }

            TextView textName = view.findViewById(R.id.text_name);
            textName.setText(names[i]);

            TextView textAge = view.findViewById(R.id.text_age);
            textAge.setText(age[i]);

            return view;
        }
    }
}
