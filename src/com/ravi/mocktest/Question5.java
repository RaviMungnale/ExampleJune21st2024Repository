package com.ravi.mocktest;
class Fuels
{
    void getFuel(String name)
    {
        name="Diesel";
        System.out.println("Fuel Name:"+name);
    }
    static void getFuelName()
    {
        System.out.println("This is our Static Method");
    }
    Fuels()
    {
        Fuels.getFuelName();
        this.getFuel("Diesel");

        String fuelName="CNG";
        System.out.println("Fuel Name:"+fuelName);
    }
}
public class Question5 {
    public static void main(String[] args) {
        Fuels rav1=new Fuels();


    }

}
