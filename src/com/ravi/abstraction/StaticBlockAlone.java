package com.ravi.abstraction;
abstract class StaticBlock
{
    static
    {
        System.out.println("It is a Static Block");


    }
}
class FirstStatic extends StaticBlock
{
    void firstblock()
    {
        System.out.println("It is a Second Static Block");
    }
}

public class StaticBlockAlone {
    public static void main(String[] args) {
        FirstStatic rav=new FirstStatic();
    }
}
