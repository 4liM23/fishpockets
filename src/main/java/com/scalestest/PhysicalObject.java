package com.scalestest;

public abstract class PhysicalObject<T extends VectorOperations<T>> {
    private double mass;
    private T velocity;
    private T acceleration;
    private T position; 

    public PhysicalObject(double mass, T velocity, T acceleration, T pos) {
        this.mass = mass;
        this.velocity = velocity;
        this.acceleration = acceleration;
        position = pos;
    }

    public double getMass() {
        return mass;
    }

    public T getPosition(){
        return position;
    }

    public T getVelocity() {
        return velocity;
    }

    public T getAcceleration() {
        return acceleration;
    }
}