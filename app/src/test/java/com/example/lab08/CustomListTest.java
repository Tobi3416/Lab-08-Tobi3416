package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    @Test
    public void hasCity_behavesCorrectly() {
        CustomList list = new CustomList();

        City edmonton = new City("Edmonton", "AB");
        City calgary  = new City("Calgary", "AB");

        list.addCity(edmonton);

        // These lines are what we expect once hasCity() exists
        assertTrue(list.hasCity(edmonton));
        assertFalse(list.hasCity(calgary));
    }
    @Test
    public void deleteCity(){
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        City calgary  = new City("Calgary",  "AB");

        list.addCity(edmonton);
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));

        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));
    }
}
