package org.example.adapter;

public class BicycleAdapter implements Vehicle {

    private final Bicycle bike;

    public BicycleAdapter(Bicycle bike){
        this.bike = bike;
    }

    @Override
    public void accelarate() {
        this.bike.pedal();
    }

    @Override
    public void pushBreak() {
        this.bike.stop();
    }

    @Override
    public void soundHorn() {
        this.bike.ringBell();
    }
}
