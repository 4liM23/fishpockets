package com.scalestest;

interface VectorOperations<T> {
    void add(T other);
    void multiply(double scale);
    void addScaled(T other, double scale);
}

public class Vector1D implements VectorOperations<Vector1D> {
    private double x;

    public Vector1D(double x){
        this.x = x;
    }

    public Vector1D(){
        this(0);
    }

    public void add(Vector1D v){
        x+=v.x;
    }

    public void multiply(double scale){
        x*=scale;
    }

    public void addScaled(Vector1D v, double scale){
        x += v.x * scale;
    }
}