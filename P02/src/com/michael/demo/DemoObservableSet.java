package com.michael.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;

/**
 * @michael
 */
public class DemoObservableSet {

    public static void main(String[] args) {
        ObservableSet<String> set1 = FXCollections.observableSet("one", "two");
        System.out.println("Creating set: " + set1);
        set1.add("three");
        set1.add("four");
        set1.add("five");
        System.out.println("After adding elemets: " + set1);
        set1.remove("four");
        System.out.println("After removing element: " + set1);
        ObservableSet<Integer> set2 = FXCollections.observableSet();
        set2.add(25);
        set2.add(100);
        set2.add(25);
        System.out.println("Set 2 after adding: " + set2);
    }
}
