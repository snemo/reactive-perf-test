package com.nuxplanet.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

class ItemReactiveRepositoryTests {

    private ItemReactiveRepository repository;

    @BeforeEach
    public void setup() {
        repository = new ItemReactiveRepository();
    }

    @Test
    public void will_get_only_one_item() {
        StepVerifier.create(repository.getItem())
                .expectSubscription()
                .expectNext(new Item("Hello world"))
                .expectComplete()
                .verify();
    }

    @Test
    public void will_get_lot_of_items() {
        StepVerifier.create(repository.getLotOfItems())
                .expectSubscription()
                .expectNext(new Item("Item 0"))
                .expectNextCount(99)
                .expectComplete()
                .verify();
    }
}