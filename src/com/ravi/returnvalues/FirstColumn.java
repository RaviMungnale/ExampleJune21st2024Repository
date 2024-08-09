package com.ravi.returnvalues;
class First1
{
int []firstcol(int a[][])
{
    int r[]=new int [a.length];

        for(int i =0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++)
            {
                if(j==0)
                {
                    r[i]=a[i][0];
                }
            }
        }
        return r;
}
}
public class FirstColumn {
    public static void main(String args[])
    {
        First1 f=new First1();
        int a[]= f.firstcol(new int[][]{{10,20,30},{40,50,60},{70,80,90}});

        for(int v:a)
        {
                System.out.print(v);
            }
        System.out.println();
        }
    }

