package com.ravi.returnvalues;
class DisplayPrice
{
    int getPrice(int price)
    {
        return price;
    }
}
public class ReturnPriceOfLaptop {
    public static void main(String[] args) {
        DisplayPrice rav= new DisplayPrice();
        int a=rav.getPrice(150000);
        System.out.println(a);
    }
}
