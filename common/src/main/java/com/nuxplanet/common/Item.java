package com.nuxplanet.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class Item {
    private final String value;
    private final byte[] load = new byte[1024];

    @JsonCreator
    public Item(@JsonProperty("value") String value) {
        this.value = value;
    }
}
