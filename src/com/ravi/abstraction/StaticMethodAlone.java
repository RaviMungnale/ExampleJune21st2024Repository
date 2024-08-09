package com.ravi.abstraction;
abstract class StaticMethod
{
    static void getboolean(boolean a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

}
}
public class StaticMethodAlone {
    public static void main(String[] args) {
        StaticMethod.getboolean(new boolean[]{false,false,false,true});

    }
}
