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
        cart.addItem("testItem");
        cart.addItem("anotherTestItem");
        assertEquals(cart.getCart(), Arrays.asList("testItem", "anotherTestItem"));
    }

    @Test
    public void shouldClearItemsAndGetEmptyListBack(){
        DummyCart cart = new DummyCart("TestId");
        cart.addItem("anotherTestId");
        assertEquals(new ArrayList<String>(), cart.clearCart());
    }

}