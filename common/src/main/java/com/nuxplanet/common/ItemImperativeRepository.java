package com.nuxplanet.common;

import org.springframework.stereotype.Repository;

@Repository
public class ItemImperativeRepository {

    public Item getItem() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Item("Hello world");
    }
}
