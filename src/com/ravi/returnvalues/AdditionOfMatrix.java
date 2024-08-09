package com.ravi.returnvalues;
class AddMatrix
{
    int[][] Addition(int a[][],int b[][])
    {
        int r[][]=new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                r[i][j]=a[i][j]+b[i][j];
            }
        }
            return r;
    }
}
public class AdditionOfMatrix {
    public static void main(String[] args) {
        AddMatrix rav= new AddMatrix();
        int a[][]={{9,9},{2,2}};
        int b[][]={{1,1},{3,3}};
        int z[][]= rav.Addition(a,b);
        for(int[] val:z)
        {
            for(int rr:val)
            {

                System.out.print(rr+" ");
            }
                System.out.println();
            }
        }
    }

