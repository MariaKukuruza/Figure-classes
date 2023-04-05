package com.company;
import java.util.ArrayList;

class Box extends Shape
{
    final ArrayList<Shape> shapes = new ArrayList<>();
    private double available;
    private double volume;

    public Box(double available)
    {
        this.available = available;
        this.volume = available;
    }
    public boolean add(Shape sh)
    {
        if (available >= sh.getVolume())
        {
            shapes.add(sh);
            available -= sh.getVolume();
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public double getVolume() {return volume;}
}