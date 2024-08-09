package com.ravi.mocktest;

import javax.naming.Name;

class Sensors
{
    void getsenorsType(String name)
    {
        name= "Name";
        System.out.println("Type of Sensor:"+name);
    }
    static void noofsensors(int num)
    {
        num=4;
        System.out.println("No of Sensors:"+num);
    }
    static
    {

        System.out.println("This is a Static Block");

    }
}
public class Question4 {
    public static void main(String[] args) {
        Sensors rav=new Sensors();
        rav.getsenorsType("CamShaft");
        Sensors.noofsensors(4);

    }


}
