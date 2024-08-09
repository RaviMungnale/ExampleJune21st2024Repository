package com.ravi.returnvalues;
class Sum1
{
    int sum2D(short c[][])
    {
        int sum=0;
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                sum=sum+c[i][j];
            }
        }
        return sum;
    }
}
public class SumOf2D {
    public static void main(String[] args) {
        Sum1 rav=new Sum1();
        short s[][]={{9,8,7},{3,2,1},{6,5,4}};
        int v1=rav.sum2D(s);
        System.out.println(v1);
    }
}
