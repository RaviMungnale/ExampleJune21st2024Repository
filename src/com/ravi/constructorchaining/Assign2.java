package com.ravi.constructorchaining;
class Maths1{
    Maths1(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<a[i].length;k++)
            {
                int s=a[k][i];
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
public class Assign2 {
    public static void main(String[] args) {
        int x[][]={{12,24,36},{48,72,84},{96,108,120}};
        Maths1 o1= new Maths1(x);
    }
}
