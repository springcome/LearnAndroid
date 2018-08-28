package com.example.rudy.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rudy.learnandroid.learn.LearnCircle;
import com.example.rudy.learnandroid.learn.LearnListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button learnCircleBtn = findViewById(R.id.circleLearnBtn);
        learnCircleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent learnCircle = new Intent(getApplicationContext(), LearnCircle.class);
                startActivity(learnCircle);
            }
        });

        Button learnListViewBtn = findViewById(R.id.listViewBtn);
        learnListViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent learnListView = new Intent(getApplicationContext(), LearnListView.class);
                startActivity(learnListView);
            }
        });
    }
}
