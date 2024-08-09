package com.ravi.methods;
class Casting
{
    void cast(byte a[])
    {
        int b[]=new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            b[k]=a[i];
            System.out.println(b[k]);

        }
    }
}
public class ByteCasting {
    public static void main(String[] args) {
        Casting rav=new Casting();
        rav.cast(new byte[]{12,24,36,48,60});

    }
}
