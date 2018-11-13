package com.moo.cart.models;

import java.util.ArrayList;


/**
 * Facilitates cart functionality and item storage
 * @author  Moo and Trixi Turny
 * @version 1.0
 * @since   2018-11-13
 */

public class DummyCart {

    private  ArrayList<DummyItem> cart = new ArrayList<DummyItem>();

    private String cartId;

    public DummyCart(String id) {

        this.cartId = id;

    }

    public DummyCart(){}


    /**
     * Adds an item to a cart
     * @param item - {@link DummyItem} - the item to be added
     * @return List of {@link DummyItem}s
     */
    public ArrayList<DummyItem> addItem(DummyItem item){
        this.cart.add(item);
        return this.getCart();
    }

    /**
     * Provide Cart Id
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
