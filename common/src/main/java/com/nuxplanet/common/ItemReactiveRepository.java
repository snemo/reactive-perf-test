package com.nuxplanet.common;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.stream.IntStream;

@Repository
public class ItemReactiveRepository {

    private final static int DELAY = 500;

    public Mono<Item> getItem() {
        return Mono.just(new Item("Hello world"))
                .delaySubscription(Duration.ofMillis(DELAY));
    }

    public Flux<Item> getLotOfItems() {
        return Flux.fromStream(IntStream.range(0, 100).boxed()
                .map(i -> new Item("Item " + i)))
                .delaySubscription(Duration.ofMillis(DELAY));
    }

    public Flux<Item> getItemsBlocking() {
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Flux.fromStream(IntStream.range(0, 100).boxed()
                .map(i -> new Item("Item " + i)));
    }
}
