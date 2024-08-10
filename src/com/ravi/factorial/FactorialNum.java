package com.ravi.factorial;

public class FactorialNum {
    public static void main(String[] args) {
          getfactorial(8);
    }
    static void getfactorial(int num)
    {
        int fact=1;
        for(int i=2;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial num"+num+" is "+fact);
    }
}
