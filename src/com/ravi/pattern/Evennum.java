package com.ravi.pattern;

public class Evennum {
    public static void main(String[] args) {
        geteven(3);
    }
    static void geteven(int num)
    {
        if(num%2==0)
        {
            System.out.println("Is even number :"+num);
        }else {
            System.out.println("Is not Even");
        }
    }
}
