package org.example.adapter;

public class Car implements Vehicle{
    @Override
    public void accelarate() {
        System.out.println("Car starts moving");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car stopped");

    }

    @Override
    public void soundHorn() {
        System.out.println("Beeb Beeb .....");
    }
}
