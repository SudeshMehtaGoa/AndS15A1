package com.mehta.android.ands15a1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;


public class RecyclerClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.recycler_example);
            // 1. get a reference to recyclerView
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);

            // this is data fro recycler view
            ItemData itemsData[] = {
            new ItemData("Alpha",R.drawable.rating_important),
            new ItemData("Beta",R.drawable.rating_important),
            new ItemData("CupCake",R.drawable.rating_important),
            new ItemData("Donut",R.drawable.rating_important),
            new ItemData("Eclair",R.drawable.rating_important),
            new ItemData("Froyo",R.drawable.rating_important),
            new ItemData("Gingerbread",R.drawable.rating_important),
            new ItemData("Honeycomb",R.drawable.rating_important),
            new ItemData("Ice Cream Sandwich",R.drawable.rating_important),
            new ItemData("Jelly Bean",R.drawable.rating_important),
            new ItemData("Jelly Bean",R.drawable.rating_important),
            new ItemData("KitKat",R.drawable.rating_important),
            new ItemData("Lollipop",R.drawable.rating_important),
            new ItemData("Marshmallow",R.drawable.rating_important)
            };

            // 2. set layoutManger
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            // 3. create an adapter
            MyAdapter mAdapter = new MyAdapter(itemsData);
            // 4. set adapter
            recyclerView.setAdapter(mAdapter);
            // 5. set item animator to DefaultAnimator
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            }
            catch(Exception exp) {
                Toast.makeText(this, exp.getMessage(),Toast.LENGTH_SHORT).show();
            }
        }
}
