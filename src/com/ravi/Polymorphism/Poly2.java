package com.ravi.Polymorphism;
abstract class GeometricShapes
{
    abstract void shapes();

}
class Cube extends GeometricShapes
{
    void shapes()
    {
        System.out.println("Cube Shape:Sweets");
    }
}
class Cuboid extends GeometricShapes
{
    void shapes()
    {
        System.out.println("Cuboid Shape:MatchBox");
    }
}
class Sphere extends GeometricShapes
{
    void shapes()
    {
        System.out.println("Sphere Shape:Tennis Ball");
    }
}

public class Poly2 {
    public static void main(String[] args) {
        GeometricShapes shape=null;

        Cube cube=new Cube();
        Cuboid cuboid=new Cuboid();
        Sphere sphere=new Sphere();

        shape=cube;
        shape.shapes();

        shape=cuboid;
        shape.shapes();

        shape=sphere;
        shape.shapes();
    }
}
