package com.nuxplanet.imperative;

import com.nuxplanet.common.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imperative")
class ImperativeController {

    @GetMapping("/item")
    Item getItem() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Item("Hello world");
    }
}
