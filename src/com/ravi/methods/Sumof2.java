package com.ravi.methods;
class Array1
{
    void Array1(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length/2;i++)
        {
            sum=sum+a[i];

        }
        System.out.println("sum of 1st half:"+sum);
        for(int i=a.length/2;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of 2nd half:"+sum);
    }
}

public class Sumof2 {
    public static void main(String[] args) {
        Array1 rav =new Array1();
        int a[]={2,4,6,8,10};
        rav.Array1(a);
    }
}
