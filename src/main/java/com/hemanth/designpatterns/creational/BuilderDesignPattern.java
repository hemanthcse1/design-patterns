package com.hemanth.designpatterns.creational;

public class BuilderDesignPattern {

    public static void main(String[] args) {

        House house = new House.HouseBuilder("Concrete","wood")
                .setFurnished(true)
                .setRoof("Tiles")
                .setPainted(false)
                .build();

        System.out.println(house);
    }
}
