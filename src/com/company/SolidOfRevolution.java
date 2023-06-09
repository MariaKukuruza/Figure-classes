package com.company;

abstract class SolidOfRevolution extends Shape
{
    protected double radius;
    public SolidOfRevolution(double radius)
    {
        this.radius = radius;
    }
    public double getRadius() {return radius;}
}

abstract class Shape {
    public abstract double getVolume();
}
