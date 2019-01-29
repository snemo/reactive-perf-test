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
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Mono.just(new Item("Hello world"));
    }

}
