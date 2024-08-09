package com.ravi.abstraction;
abstract class Overloading
{
    Overloading (String machineName) {
        System.out.println("Machine Name:" + machineName);
    }
    Overloading (int price)
    {
        System.out.println("Machine Price:"+price);
    }
}
class Overloading1 extends Overloading
{
    Overloading1(String machineName)
    {
        super(machineName);
    }
    Overloading1(int price)
    {
        super(price);
    }
}
public class ConstructorOverloadingAlone {
    public static void main(String[] args) {

    Overloading1 o=new Overloading1("Wheel Alignment");
    Overloading1 o1=new Overloading1(890000);


    }
}
