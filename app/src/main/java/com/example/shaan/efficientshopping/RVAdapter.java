package com.example.shaan.efficientshopping;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shaan on 8/30/2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.StoreViewHolder> {

    public static class StoreViewHolder extends  RecyclerView.ViewHolder{

        CardView cv;
        TextView storeName;
        TextView location;


        StoreViewHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            storeName = (TextView)itemView.findViewById(R.id.store);
            location = (TextView) itemView.findViewById(R.id.location);
        }


    }
    List<ShoppingListFeedDbHelper> stores;

    RVAdapter(List<ShoppingListFeedDbHelper> stores){
        this.stores = stores;
    }

    @Override
    public StoreViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(StoreViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return stores.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


}
