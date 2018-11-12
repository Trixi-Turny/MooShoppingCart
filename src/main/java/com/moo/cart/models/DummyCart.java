package com.moo.cart.models;

import java.util.ArrayList;


/**
 * Facilitates cart functionality and item storage
 */
public class DummyCart {

    private  ArrayList<String> cart = new ArrayList<String>();

    private String id;

    public DummyCart(String id) {
        this.id = id;
        cart.add(this.id);

    }


    public DummyCart(){}


    /**
     * Add item to cart
     * @param id - String - the item to be added
     * @return the cart
     */
    public ArrayList<String> addItem(String id){
        this.cart.add(id);
        return this.cart;
    }

    /**
     * Provide Id
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * Empty cart
     * @return empty list
     */
    public ArrayList<String> clearCart(){
        this.cart.clear();
        return this.cart;
    }

    /**
     * provide list of items
     * @return ArrayList with item ids
     */
    public ArrayList<String> getCart(){
        return this.cart;

    }
}
