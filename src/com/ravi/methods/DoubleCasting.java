package com.ravi.methods;
class CastDb
{
    void CastD(double a[][])
    {
        int b[][]=new int[a.length][a[0].length];
        int k=0,z=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[k][z]= (int)a[i][j];
                System.out.println(b[k][z]+" ");
            }

            System.out.println();
        }
    }
}
public class DoubleCasting {
    public static void main(String[] args) {
        CastDb rav = new CastDb();
        rav.CastD(new double[][]{{10.8, 6.9, 5.5}, {11.1, 12.2, 13.3}, {15.5, 16.5, 17.5}});
    }
}