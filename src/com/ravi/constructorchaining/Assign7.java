package com.ravi.constructorchaining;
class Maths6
{
    Maths6(int r[])
    {
        for(int i=0;i<r.length;i++)
        {
            r[i]=r[i]/2;
            System.out.print(r[i]+" ");
        }
        System.out.println();
    }
}
public class Assign7 {
    public static void main(String[] args) {
        int x[]={91,92,93,94,95,96,98,99};
        Maths6 rav = new Maths6(x);
    }
}
