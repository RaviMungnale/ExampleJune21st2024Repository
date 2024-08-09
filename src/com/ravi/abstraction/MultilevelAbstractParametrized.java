package com.ravi.abstraction;
abstract class Motors
{
    Motors(String cn,int price)
    {
        System.out.println("Car Name:"+cn);
        System.out.println("Car Price:"+price);
    }
}
class Seller extends Motors
{
    Seller(String cn,int price)
    {
        super(cn,price);
    }
}
class Buyer extends Seller
{
    Buyer(String cn,int price)
    {
        super(cn,price);
    }
}

public class MultilevelAbstractParametrized {
    public static void main(String[] args) {
        Buyer rav = new Buyer("THAR",200000000);


    }
}
