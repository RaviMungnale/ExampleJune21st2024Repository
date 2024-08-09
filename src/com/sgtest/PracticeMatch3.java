package com.sgtest;
class Measurements3
{
    void areaofSquare(int x )
    {
        System.out.println("Area of Square:"+(x*x));
    }
}
class Rectangle2 extends Measurements3
{
    void areaofrectangle(int l,int b)
    {
        System.out.println("Area of Rectangle:"+(l*b));
    }
}
class Circle2 extends Measurements3
{
    void areaofcircle(double pi,int r)
    {
        System.out.println("Area of Circle:"+(pi*r*r));
    }
}
class Trapezium1 extends Circle2
{
    void areaoftrapezium(int a,int b,int h)
    {
        System.out.println("Area of Trapezium:"+(((a+b)/2)*h));
    }
}
public class PracticeMatch3 {
    public static void main(String[] args) {
        Trapezium1 rav=new Trapezium1();
        rav.areaoftrapezium(13,20,15);
        rav.areaofcircle(3.14,15);
        rav.areaofSquare(20);

        Rectangle2 rav1=new Rectangle2();
        rav1.areaofrectangle(15,25);

    }
}
