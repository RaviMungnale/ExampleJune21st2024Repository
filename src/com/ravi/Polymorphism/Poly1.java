package com.ravi.Polymorphism;
abstract class GeometricFigure
{
    abstract void area();
}
class Square extends GeometricFigure
{
    void area()
    {
        int side=6;
        System.out.println("Area of the square:"+(side*side));
    }
}
class Rectangle extends GeometricFigure
{
    void area()
    {
        int length=15,breadth=10;
        System.out.println("Area of the rectangle:"+(length*breadth));
    }
}
    class Circle extends GeometricFigure
    {
        void area ()
        {
            double pi=3.14;
            double r=2.5;
            System.out.println("Area of the circle:"+(pi*r*r));
        }
    }


public class Poly1 {
    public static void main(String[] args) {
        GeometricFigure figure=null;
        Square square=new Square();
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();

        figure=square;
        figure.area();

        figure=rectangle;
        figure.area();

        figure=circle;
        figure.area();
    }
}
