package com.scalestest;

interface VectorOperations<T> {
    void add(T other);
    void multiply(double scale);
    void addScaled(T other, double scale);
}

public class Vector2D implements VectorOperations<Vector2D> {
    private double x, y;

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector2D(){
        this(0, 0);
    }

    public void add(Vector2D v){
        x+=v.x;
        y+=v.y;
    }

    public void multiply(double scale){
        x*=scale;
        y*=scale;
    }

    public void addScaled(Vector2D v, double scale){
        x += v.x * scale;
        y += v.y * scale;
    }
}