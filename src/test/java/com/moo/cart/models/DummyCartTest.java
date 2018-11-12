package com.moo.cart.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DummyCartTest {

    @Test
    public void shouldStoreCartId() {
        // Given

        // When
        DummyCart cart = new DummyCart("ABC");

        // Then
        assertEquals("ABC", cart.getId());
    }


    @Test
    public void shouldAddItemsToList(){
        DummyCart cart = new DummyCart();
        DummyItem item1 = new DummyItem("testItem");
        DummyItem item2 = new DummyItem("anotherItem");

        //When
        cart.addItem(item1);
        cart.addItem(item2);

        //Then
        assertEquals(cart.getCart(), Arrays.asList(item1, item2));
    }

    @Test
    public void shouldClearItemsAndGetEmptyListBack(){

        //When
        DummyCart cart = new DummyCart("TestId");
        cart.addItem("anotherTestId");

        //Then
        assertEquals(new ArrayList<String>(), cart.clearCart());
    }



}