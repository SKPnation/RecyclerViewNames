package com.example.ayomide.recyclerviewnames;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String data1[], data2[];
    int img[];
    Context ctx;

    public MyOwnAdapter(String[] data1, String[] data2, int[] img, Context ctx) {
        this.data1 = data1;
        this.data2 = data2;
        this.img = img;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater myInflater = LayoutInflater.from(ctx);
        View myOwnView = myInflater.inflate(R.layout.my_row,viewGroup,false);
        return new MyOwnHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder myOwnHolder, int i) {
        myOwnHolder.text1.setText(data1[i]);
        myOwnHolder.text2.setText(data2[i]);
        myOwnHolder.myImage.setImageResource(img[i]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder{
        TextView text1,text2;
        ImageView myImage;
        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.text1);
            text2 = itemView.findViewById(R.id.text2);
            myImage = itemView.findViewById(R.id.myImage);
        }
    }
}
