package com.scalestest;

public class PhysicalAttributes {
    private double mass;
    private double velocity;
    private double acceleration;

    public PhysicalAttributes(double mass, double velocity, double acceleration) {
        this.mass = mass;
        this.velocity = velocity;
        this.acceleration = acceleration;
    }


    public PhysicalAttributes(double mass) {
        this.mass = mass;
        this.velocity = 0;
        this.acceleration = 0;
    }

}