package com.example.ayomide.recyclerviewnames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class   MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String data1[],data2[];
    private int imageResource[] = {R.drawable.cat, R.drawable.dog, R.drawable.cat, R.drawable.dog, R.drawable.cat, R.drawable.dog, R.drawable.cat};

    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.myRecycler);
        data1 = getResources().getStringArray(R.array.pet_name);
        data2 = getResources().getStringArray(R.array.desc);

        ad = new MyOwnAdapter(data1, data2, imageResource, this);

        recyclerView.setAdapter(ad);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
