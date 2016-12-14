package com.jcf.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "a");
        hashMap.put(4, "b");
        hashMap.put(3, "c");
        hashMap.put(2, "d");
        hashMap.put(1, "e");

        System.out.println(hashMap); // {1=e, 2=d, 3=c, 4=b, 5=a}

        HashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(5, "a");
        linkedHashMap.put(4, "b");
        linkedHashMap.put(3, "c");
        linkedHashMap.put(2, "d");
        linkedHashMap.put(1, "e");

        System.out.println(linkedHashMap); // {5=a, 4=b, 3=c, 2=d, 1=e}

        Map<Integer, String> linkedHashMap1 = new LinkedHashMap<>(3, 5, true);
        linkedHashMap1.put(5, "a");
        linkedHashMap1.put(4, "b");
        linkedHashMap1.put(3, "c");
        linkedHashMap1.put(2, "d");
        linkedHashMap1.put(1, "e");

        linkedHashMap1.get(3);
        linkedHashMap1.get(5);
        linkedHashMap1.get(1);

        System.out.println(linkedHashMap1);

        LinkedHashMap<Integer, String> simpleLRUCache = new SimpleLRUCache(2);
        simpleLRUCache.put(1, "a");
        simpleLRUCache.put(2, "b");
        simpleLRUCache.put(3, "c");

        simpleLRUCache.get(2);

        simpleLRUCache.put(9, "u");

        System.out.println(simpleLRUCache);

    }
}
