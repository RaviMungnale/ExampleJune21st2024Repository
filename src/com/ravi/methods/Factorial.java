package com.ravi.methods;
class Methods
{
    void fact(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
            System.out.println(fact);
    }
}
public class Factorial {
    public static void main(String[] args) {
        Methods rav= new Methods();
        rav.fact(6);
        rav.fact(8);
    }
}
