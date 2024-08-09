package com.ravi.constructorchaining;
class Maths3
{
    Maths3(byte a[][])
    {
        int sum=0;
        for(int i= 0;i<a.length;i++)
        {
            for(int k=0;k<a.length;k++) {

                sum = sum + a[i][k];

            }

        }
        System.out.print(sum+" ");
    }
}

public class Assign4 {
    public static void main(String[] args) {
        byte b[][]={{8,16,24},{32,40,48},{56,64,72}};
        Maths3 o1= new Maths3(b);

    }
}
