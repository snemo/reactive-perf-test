package com.nuxplanet.reactive;

import com.nuxplanet.common.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest
@RunWith(SpringRunner.class)
public class ReactiveControllerTests {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void will_get_just_one_item() {
        webClient.get().uri("/reactive/item")
                .exchange()
                .expectStatus().isOk()
                .expectBody(Item.class)
                .isEqualTo(new Item("Hello world"));

    }
}
