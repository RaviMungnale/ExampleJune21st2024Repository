package com.ravi.methods;
class Methods1
{
    void array(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if((i==0)||(i==(a.length-1)))
            {
                System.out.println(a[i]);

            }
        }

    }
}
public class FirstandLastElement {
    public static void main(String[] args) {
        Methods1 rav= new Methods1();
        rav.array(new int[] {4,5,6,7,8});
        rav.array(new int[] {45,55,65,75,85});
    }
}
