package com.moo.cart.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyItemTest {

    @Test
    public void shouldGetCorrectId(){

        //When
        DummyItem item  = new DummyItem("id");

        //Then

        assertEquals(item.getId(), "id");


    }
}
