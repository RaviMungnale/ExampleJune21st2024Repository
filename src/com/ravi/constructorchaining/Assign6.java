package com.ravi.constructorchaining;
class Maths5
{
    Maths5(double d[][])
    {
        for(int i=d.length-1;i>=0;i--)
        {
            for(int k=d.length-1;k>=0;k--)
            {
                System.out.print(d[i][k] + " ");
            }
            System.out.println();
        }
    }
}
public class Assign6 {
    public static void main(String[] args) {
        double r[][]={{12.5,10.5,30.5},{14.75,20.56,20.1},{31.3,40.14,3.17}};
        Maths5 obj1= new Maths5(r);
    }
}
