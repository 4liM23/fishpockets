package com.scalestest;

public abstract class PhysicalObeject {
    private double mass;
    private double velocity;
    private double acceleration;
    private Position position; 

    public PhysicalObeject(double mass, double velocity, double acceleration) {
        this.mass = mass;
        this.velocity = velocity;
        this.acceleration = acceleration;
    }


    public PhysicalObeject(double mass) {
        this.mass = mass;
        this.velocity = 0;
        this.acceleration = 0;
    }

}