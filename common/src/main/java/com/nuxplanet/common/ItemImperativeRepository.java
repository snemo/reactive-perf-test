package com.nuxplanet.common;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Repository
public class ItemImperativeRepository {

    public Item getItem() {
        sleep();
        return new Item("Hello world");
    }

    public List<Item> getLotOfItems() {
        sleep();
        return IntStream.range(0, 100).boxed()
                .map(i -> new Item("Item " + i))
                .collect(Collectors.toList());
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
