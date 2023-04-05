package com.company;

class Pyramid extends Shape
{
    private double height;
    private double s; // площадь основания

    public Pyramid(double height, double s)
    {
        this.height = height;
        this.s = s;
    }
    @Override
    public double getVolume() {return height * s * 4 / 3;}
}


