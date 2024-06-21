package com.hemanth.designpatterns.structural.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Vehicle car = new Car(new Produce(), new Assemble());
        car.manufacture();

        System.out.println();

        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.manufacture();
    }
}
