package com.noeurng.basicdagger2.model;

public class Motor implements Vehicle{

    int rpm;

    public Motor() {
        rpm = 0;
    }

    @Override
    public int getSpeed() {
        return rpm;
    }

    @Override
    public void accelerate(int value) {
        rpm = rpm + value;
    }

    @Override
    public void brake() {
        rpm = 0;
    }
}
