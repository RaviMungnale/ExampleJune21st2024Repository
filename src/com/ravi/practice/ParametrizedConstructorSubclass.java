package com.ravi.practice;
class Manufacturer
{
    String carMaker;
    String carModel;
    Manufacturer(String company,String model)
    {
        carMaker=company;
        carModel=model;
        System.out.println("Car Maker Brand:"+company);
        System.out.println("Car Model:"+model);
    }
}
class Showroom extends Manufacturer
{
    String dealer;
    Showroom(String company,String model,String dealer)
    {
        super(company,model);
        this.dealer=dealer;
        System.out.println("Car Dealer Name:"+dealer);
    }
}
public class ParametrizedConstructorSubclass {
    public static void main(String[] args) {
        Showroom rav=new Showroom("Mahindra","Scorpio","Ravi Motors");
        Showroom rav2=new Showroom("Tata","Safari","Aarvi Motors");
    }
}
