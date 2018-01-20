package com.example.admin.foodapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.foodapp.adapters.FoodAdapter;

public class MainActivity extends AppCompatActivity implements FoodAdapter.OnListItemClickListener {

    RecyclerView recyclerView;
    private FoodAdapter foodAdapter;
    private String[] foodItems = {"Apple", "Mango", "Banana", "Strawberry", "Grapes"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        foodAdapter = new FoodAdapter(this, foodItems, this);
        recyclerView.setAdapter(foodAdapter);
    }

    @Override
    public void onListItemClick(int position) {

    }
}
