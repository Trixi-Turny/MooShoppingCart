package com.moo.cart.models;

import java.util.ArrayList;

public class DummyCart {
    private  ArrayList<String> cart = new ArrayList<String>();

    private String id;

    public DummyCart(String id) {
        this.id = id;
        cart.add(this.id);

    }
    public DummyCart(){}


    public ArrayList<String> addItem(String id){
        this.cart.add(id);
        return this.cart;
    }

    public String getId() {
        return this.id;
    }

    public ArrayList<String> clearCart(){

        this.cart.clear();
        return this.cart;
    }

    public ArrayList<String> getCart(){
        return this.cart;

    }
}
