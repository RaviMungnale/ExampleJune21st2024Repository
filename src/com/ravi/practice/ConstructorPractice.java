package com.ravi.practice;
class AA
{
    AA()

    {
        System.out.println("It is a AA Constructor");
    }
}
class BB extends AA
{
    BB()
    {
        super();
        System.out.println("It is a BB Constructor");
    }
}
class CC extends BB
{
    CC()
    {
        super();
        System.out.println("It is a CC Constructor");
    }
}
public class ConstructorPractice {
    public static void main(String[] args) {
        CC rav=new CC();
    }
}
