package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    @Test
    public void hasCityTest() {
        CustomList list = new CustomList();

        City edmonton = new City("Edmonton", "AB");
        City calgary  = new City("Calgary", "AB");

        list.addCity(edmonton);

        // These lines are what we expect once hasCity() exists
        assertTrue(list.hasCity(edmonton));
        assertFalse(list.hasCity(calgary));
    }
    @Test
    public void deleteCityTest(){
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
    @Test
    public void countCitiesTest() {
        CustomList list = new CustomList();

        assertEquals(0, list.countCities());

        list.addCity(new City("Edmonton", "AB"));
        assertEquals(1, list.countCities());

        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.countCities());
    }

}
