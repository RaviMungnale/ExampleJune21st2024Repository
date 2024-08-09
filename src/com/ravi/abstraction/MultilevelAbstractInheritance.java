package com.ravi.abstraction;
abstract class Grandparent
{
    void grandpa(String name)
    {
        System.out.println("Grandpa Name:" + name);

    }

}
class Parent extends Grandparent
{
    void papa(String name)
    {
        System.out.println("Papa Name:"+name);
    }
}
class Child extends Parent
{
    void son(String name)
    {
        System.out.println("Son Name:"+name);
    }
}
public class MultilevelAbstractInheritance {
    public static void main(String[] args) {
        Child rav=new Child();
        rav.grandpa("Shree MukindRao");
        rav.papa("Shree Prakash");
        rav.son("Ravi");
    }
}
