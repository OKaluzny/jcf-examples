package com.jcf.phoneTest;

public class ShippingOrder<K, V> {

    // The business logic to ship goods goes here
    private K key;
    private V value;

    public ShippingOrder(K key, V value) {

        this.key = key;
        this.value = value;
    }
}
