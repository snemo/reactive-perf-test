package com.nuxplanet.imperative;

import com.nuxplanet.common.Item;
import com.nuxplanet.common.ItemImperativeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imperative")
@AllArgsConstructor
class ImperativeController {

    private final ItemImperativeRepository itemImperativeRepository;

    @GetMapping("/item")
    Item getItem() {
        return itemImperativeRepository.getItem();
    }
}
