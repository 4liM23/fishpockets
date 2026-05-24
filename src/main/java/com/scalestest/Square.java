package com.scalestest;

public class Square extends PhysicalObject<Vector2D> {

    private double sideLength;

    public Square(double mass, Vector2D velocity, Vector2D acceleration, Vector2D position, double side){
        super(mass, velocity, acceleration, position);
        this.sideLength = side;
    }
    

}