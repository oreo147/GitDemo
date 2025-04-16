package com.project;

public class Car {

    public static void main(String[] args) {
        System.out.println("Hello there");

        Engine obj = new Petrol(); // Corrected: use interface type for polymorphism
        obj.petrol();
    }
}
