package com.sgtest;
class Measurements
{
    void areaofsquare(int x)
    {
        System.out.println("Area of Square:"+(x*x));
    }
}
class Rectangle extends Measurements
{
    void areaofrectangle(int x, int y)
    {
        System.out.println("Area of Rectangle:"+(x*y));
    }
}
class Circle extends Rectangle
{
    void areaofcircle(double a,int r)
    {
        System.out.println("Area of Circle:"+(a*r*r));
    }
}
public class PracticeMatchforInheritance {
    public static void main(String[] args) {
        Circle rav=new Circle();
        rav.areaofcircle(3.14,10);
        rav.areaofrectangle(15,20);
        rav.areaofsquare(50);
    }
}
