package com.moo.cart.models;

import java.util.ArrayList;


/**
 * Facilitates cart functionality and item storage
 */
public class DummyCart {

    private  ArrayList<DummyItem> cart = new ArrayList<DummyItem>();

    private String id;

    public DummyCart(String id) {
        DummyItem item = new DummyItem(id);
        cart.add(item);

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
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * Empty cart
     * @return empty list
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
