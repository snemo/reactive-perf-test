package com.nuxplanet.common;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemImperativeRepositoryTests {

    private ItemImperativeRepository repository;

    @BeforeEach
    public void setup() {
        repository = new ItemImperativeRepository();
    }

    @Test
    public void will_get_only_one_item() {
        assertEquals(repository.getItem(), new Item("Hello world"));
    }

    @Test
    public void will_get_lot_of_items() {
        assertEquals(repository.getLotOfItems().size(), 100);
    }
}