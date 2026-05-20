package com.scalestest;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
        this(0, 0);
    }

    // Getters for x and y
    public double getX() {return x;}
    public double getY() {return y;}

    // Setters for x and y
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    // Method to calculate distance to another Position
    public double distanceTo(Position other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void move(double dx, double dy) {
        setX(x + dx);
        setY(y + dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}