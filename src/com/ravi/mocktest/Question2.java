package com.ravi.mocktest;
class IcEngines
{
    {
        String fuelType="Diesel";
        int noofCylinders= 4;
        System.out.println("Fuel Type:"+fuelType);
        System.out.println("No of Cyliners:"+noofCylinders);
    }

    IcEngines()
    {
        String engineType="FI";
        System.out.println("Engine Type:"+engineType);
    }


}

public class Question2 {
    public static void main(String[] args) {
        IcEngines rav=new IcEngines();
    }
}
