package com.ravi.encapsulation;

import javax.print.attribute.standard.PresentationDirection;

class Maths
{
    static String mathType;
    static void addition(int x,int y)
    {
        int res=(x+y);
        System.out.println("Maths Type:"+res);
    }
}
public class StaticMethodIndependent {
    public static void main(String[] args) {
        Maths.mathType="Algebra";
        System.out.println("Addition Result:"+Maths.mathType);
        Maths.addition(150,250);

    }
}
