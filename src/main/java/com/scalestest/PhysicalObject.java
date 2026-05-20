package com.scalestest;

public abstract class PhysicalObject {
    private double mass;
    private double velocity;
    private double acceleration;
    private Position position; 

    public PhysicalObject(double mass, double velocity, double acceleration) {
        this.mass = mass;
        this.velocity = velocity;
        this.acceleration = acceleration;
    }


    public PhysicalObject(double mass) {
        this.mass = mass;
        this.velocity = 0;
        this.acceleration = 0;
    }

}