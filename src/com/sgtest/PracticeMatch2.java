package com.sgtest;
class Measurements2
{
    void areaofsquare(int a)
    {
        System.out.println("Area of Square:"+(a*a));
    }
}
class Rectangle1 extends Measurements2
{
    void areaofrectangle(int x, int y)
    {
        System.out.println("Area of Rectangle:"+(x*y));
    }
}
class Circle1 extends Measurements2
{
    void areaofcircle(double pi,int r)
    {
        System.out.println("Area of Circle:"+(pi*r*r));
    }
}
class Trapezium extends Measurements2
{
    void areaoftrapezium(int l, int b, int h)
    {
        System.out.println("Area of Trapezium:"+((l+b)/2*(h)));
    }
}

public class PracticeMatch2 {
    public static void main(String[] args) {
        Rectangle1 rav=new Rectangle1();
        rav.areaofrectangle(4,2);
        rav.areaofsquare(100);

        Trapezium rav1=new Trapezium();
        rav1.areaoftrapezium(10,15,20);

        Circle1 rav2=new Circle1();
        rav2.areaofcircle(3.14,25);

    }
}
