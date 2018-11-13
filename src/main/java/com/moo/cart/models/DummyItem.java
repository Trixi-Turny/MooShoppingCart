package com.moo.cart.models;

/**
 * Facilitates the storage of information about an item in the cart
 *
 * @author  Trixi Turny
 * @version 1.0
 * @since   2018-11-13
 */
public class DummyItem {
    public void setId(String id) {
        this.id = id;
    }

    public DummyItem(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    private String id;

}
