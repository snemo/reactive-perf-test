package com.nuxplanet.reactive;

import com.nuxplanet.common.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/reactive")
class ReactiveController {

    @GetMapping("/item")
    Mono<Item> getItem() {
        return Mono.just(new Item("Hello world"))
                .delaySubscription(Duration.ofMillis(500));
    }

}
