package com.example.shaan.efficientshopping;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Shaan on 9/27/2015.
 */
public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.StoreViewHolder> {

    private List<Store> storeList;

    public StoreAdapter(List<Store> storeList){
        this.storeList = storeList;
    }

    @Override
    public int getItemCount(){
        return storeList.size();
    }

    @Override
    public void onBindViewHolder(StoreViewHolder storeViewHolder, int i) {
        Store s = storeList.get(i);
        storeViewHolder.vName.setText(s.Name);
        storeViewHolder.vLocation.setText(s.Location);

    }

    @Override
    public StoreViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_layout, viewGroup, false);

        return new StoreViewHolder(itemView);
    }


    public static class StoreViewHolder extends RecyclerView.ViewHolder {
        protected TextView vName;
        protected TextView vLocation;

        public StoreViewHolder(View v) {
            super(v);
            vName = (TextView) v.findViewById(R.id.store);
            vLocation = (TextView) v.findViewById(R.id.location);


        }
    }
}


