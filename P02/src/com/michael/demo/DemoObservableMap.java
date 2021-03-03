package com.michael.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

/**
 * @michael
 */
public class DemoObservableMap {

    public static void main(String[] args) {
        ObservableMap<String, Integer> map1 = FXCollections.observableHashMap();
        map1.put("Key1", 200);
        map1.put("Key2", -25);
        map1.put("Key3", 1_000);
        map1.put("Key4", 255);
        System.out.println("After create and add: " + map1);
        map1.put("Key1", 10_000);
        System.out.println("After replace: " + map1);
        System.out.println("Get value in key 3: " + map1.get("Key3"));
    }
}
