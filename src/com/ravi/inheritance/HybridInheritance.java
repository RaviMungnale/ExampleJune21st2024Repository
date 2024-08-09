package com.ravi.inheritance;
class Customer
{
    void cust(String name)
    {
        System.out.println("Customer Name:"+name);
    }
}
class Product extends Customer
{
    void prod(String name,int id)
    {
        System.out.println("Product Name:"+name);
        System.out.println("Product Id:"+id);
    }
}
class Product1 extends Customer
{
    void produ(String name,int id)
    {
        System.out.println("Product Name:"+name);
        System.out.println("Product Id:"+id);
    }

}
class CityName extends Product1
{
    void CName(String name)
    {
        System.out.println("City Name:"+name);
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        Product rav=new Product();
        rav.prod("Parle G",12);
        rav.cust("Shree");
        CityName ravi=new CityName();
        ravi.CName("Bidar");
    }
}
