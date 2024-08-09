package com.ravi.Polymorphism;
abstract class VehicleSpeed
{
    abstract void speed();

}
class RavisCar extends VehicleSpeed
{
    void speed()
    {
        int speed=120;
        System.out.println("Ravi's Car Speed:"+(speed));
    }
}
class PunithsCar extends VehicleSpeed
{
    void speed()
    {
        int speed=100;
        System.out.println("Punith's Car Speed:"+(speed));
    }
}
class SimhasBike extends VehicleSpeed
{
    void speed()
    {
        int speed=80;
        System.out.println("Simha's Bike Speed:"+(speed));

    }
}
public class Poly3 {
    public static void main(String[] args) {
        VehicleSpeed speeds=null;

        RavisCar ravisCar=new RavisCar();
        PunithsCar punithsCar=new PunithsCar();
        SimhasBike simhasBike=new SimhasBike();

        speeds=ravisCar;
        speeds.speed();

        speeds=punithsCar;
        speeds.speed();

        speeds=simhasBike;
        speeds.speed();
    }
}
