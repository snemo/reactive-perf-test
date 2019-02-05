package com.nuxplanet.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Item {
    private final String value;
    private final byte[] load = new byte[1024];

    @JsonCreator
    public Item(@JsonProperty("value") String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(value, item.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
