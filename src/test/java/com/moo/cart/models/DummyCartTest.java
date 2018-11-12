package com.moo.cart.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DummyCartTest {

    @Test
    public void shouldGetCorrectCartI() {
        // Given

        // When
        DummyCart cart = new DummyCart("ABC");

        // Then
        assertEquals(cart.getId(), "ABC");
    }


    @Test
    public void shouldAddItemsToList() {
        DummyCart cart = new DummyCart();

        //When

        DummyItem item1 = new DummyItem("testItem");
        DummyItem item2 = new DummyItem("anotherItem");
        cart.addItem(item1);
        cart.addItem(item2);

        //Then
        assertEquals(cart.getCart(), Arrays.asList(item1, item2));
    }

    @Test
    public void shouldClearItemsAndGetEmptyListBack() {

        //When
        DummyCart cart = new DummyCart();
        DummyItem item = new DummyItem("testId");
        cart.addItem(item);

        //Then
        assertEquals(new ArrayList<DummyItem>(), cart.clearCart());
    }

}