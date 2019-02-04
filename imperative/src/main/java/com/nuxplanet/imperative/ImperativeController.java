package com.nuxplanet.imperative;

import com.nuxplanet.common.Item;
import com.nuxplanet.common.ItemImperativeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/imperative")
@AllArgsConstructor
class ImperativeController {

    private final ItemImperativeRepository repository;

    @GetMapping("/item")
    Item getItem() {
        return repository.getItem();
    }

    @GetMapping("/items")
    List<Item> getItems() {
        return repository.getLotOfItems();
    }
}
