package com.moo.cart.models;

import java.util.ArrayList;


/**
 * Facilitates cart functionality and item storage
 */
public class DummyCart {

    private  ArrayList<DummyItem> cart = new ArrayList<DummyItem>();

    private String cartId;

    public DummyCart(String id) {

        this.cartId = id;

    }

    public DummyCart(){}


    /**
     * Add item to cart
     * @param item - DummyItem - the item to be added
     * @return List of {@link DummyItem}s
     */
    public ArrayList<DummyItem> addItem(DummyItem item){
        this.cart.add(item);
        return this.getCart();
    }

    /**
     * Provide Id
     * @return - cart Id  - String
     */
    public String getId() {
        return this.cartId;
    }

    /**
     * Empty cart
     * @return empty list ArrayList of {@link DummyItem}s
     */
    public ArrayList<DummyItem> clearCart(){
        this.cart.clear();
        return this.getCart();
    }

    /**
     * provide list of items
     * @return  List of {@link DummyItem}s
     */
    public ArrayList<DummyItem> getCart(){
        return this.cart;

    }
}
