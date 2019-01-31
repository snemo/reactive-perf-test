package com.nuxplanet.common;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Repository
public class ItemReactiveRepository {
    public Mono<Item> getItem() {
        return Mono.just(new Item("Hello world"))
                .delaySubscription(Duration.ofMillis(500));
    }
}
