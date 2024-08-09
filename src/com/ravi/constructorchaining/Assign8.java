package com.ravi.constructorchaining;
class Maths7
{
    Maths7(int a[][],int b[][])
    {
        int row=a.length;
        int col=a[0].length;
        int[] oneD= new int[row*col];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<a.length;k++)
            {
                oneD[index]=a[i][k];
                index++;
            }
        }
        for(int i=0;i<oneD.length;i++)
        {
            System.out.println(oneD[i]+" ");
        }
    }
}
public class Assign8 {
    public static void main(String[] args) {
        Maths7 r1=new Maths7(new int [][]{{11,22,33},{44,55,66},{77,88,99}},new int[][]{{5,15,25},{35,45,55},{65,75,85}});
    }
}
