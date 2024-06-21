package com.hemanth.designpatterns.structural.bridge;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.print("And Assembled.");
    }
}
