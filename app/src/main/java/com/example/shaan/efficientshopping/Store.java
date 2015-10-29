package com.example.shaan.efficientshopping;

/**
 * Created by Shaan on 9/11/2015.
 */
public class Store {
    protected int StoreId;
    protected String Name;
    protected String Location;

    public int getStoreId() {
        return StoreId;
    }

    public void setStoreId(int storeId) {
        StoreId = storeId;
    }


    public void setLocation(String location) {
        Location = location;
    }

    public String getLocation() {
        return this.Location;
    }


    public void setName(String name) {
        Name = name;
    }


    public String getName() {
        return this.Name;
    }


}




