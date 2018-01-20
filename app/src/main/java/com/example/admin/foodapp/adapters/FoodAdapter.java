package com.example.admin.foodapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.foodapp.R;

/**
 * Created by admin on 1/20/2018.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodItemViewHolder> {
    private Context mContext;
    private String[] foodItems;
    private OnListItemClickListener onListItemClickListener;
    public FoodAdapter(Context context, String[] foodItems, OnListItemClickListener onListItemClickListener){
        mContext = context;
        this.foodItems = foodItems;
        this.onListItemClickListener = onListItemClickListener;
    }
    @Override
    public FoodItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);
        return new FoodItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(FoodItemViewHolder holder, int position) {
        holder.foodNameTv.setText(foodItems[position]);
    }

    @Override
    public int getItemCount() {
        return foodItems.length;
    }

    class FoodItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView foodNameTv;
        public FoodItemViewHolder(View itemView) {
            super(itemView);
            foodNameTv = itemView.findViewById(R.id.food_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            onListItemClickListener.onListItemClick(position);
        }
    }

    public interface OnListItemClickListener {
        public void onListItemClick(int position);
    }
}
