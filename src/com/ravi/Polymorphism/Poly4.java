package com.ravi.Polymorphism;
abstract class VehiclesLubricants
{
    abstract void engineoilcapacity();

}
class Bikes extends VehiclesLubricants
{
    void engineoilcapacity()
    {
        int litres=1;
        System.out.println("Bikes EngineOil Capacity:"+(litres));
    }
}
class Cars extends VehiclesLubricants
{
    void engineoilcapacity()
    {
        double litres1=3.5;
        System.out.println("Cars EngineOil Capacity:"+(litres1));
    }
}
class Trucks extends VehiclesLubricants
{
    void engineoilcapacity()
    {
        int litres2=15;

        System.out.println("Trucks EngineOil Capacity:"+(litres2));
    }
}
public class Poly4 {
    public static void main(String[] args) {
        VehiclesLubricants lubricants=null;

        Bikes bike=new Bikes();
        Cars car=new Cars();
        Trucks truck=new Trucks();

        lubricants=bike;
        lubricants.engineoilcapacity();

        lubricants=car;
        lubricants.engineoilcapacity();

        lubricants=truck;
        lubricants.engineoilcapacity();
    }
}
