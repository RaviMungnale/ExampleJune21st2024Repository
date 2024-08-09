package com.ravi.abstraction;
abstract class InstanceBlock
{
    {
        String carName = "Mustang";
        int price = 8500000;
        System.out.println("Car Name:"+carName);
        System.out.println("Car Price:"+price);
    }
}
class SportsCar extends InstanceBlock
{
    void showsportscar()
    {
        String ScarName= "Ferrari";
        int NoOfCylinders=8;
        System.out.println("Sports Car Name:"+ScarName);
        System.out.println("No of Cylinders:"+NoOfCylinders);

    }


}
public class InstanceBlockAlone {
    public static void main(String[] args) {
        SportsCar rav=new SportsCar();

    }
}
