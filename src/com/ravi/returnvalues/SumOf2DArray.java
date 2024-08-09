package com.ravi.returnvalues;
class SumArray
{
    short Sum2D(short c[][])
    {
        short sum=0;
        for(int i=0;i<c.length;i++) {
            for (int j = 0; j < c[i].length; j++)
            {
                sum=(short)(sum+c[i][j]);
            }

        }
        return sum;
    }
}
public class SumOf2DArray {
    public static void main(String[] args){
        SumArray rav=new SumArray();
        short s[][]={{100,200,300},{700,800,900},{400,500,600}};
        short r=rav.Sum2D(s);
        System.out.println(r);
    }
}
