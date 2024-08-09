package com.ravi.methods;
class ThirdAndFourth
{
    void thirdandfourth1(int a[][])
    {
        for(int i=0;i<a.length;i++) {
            if((i==a.length-2)||(i==(a.length-1)))
            {
                for(int j=0; j<a[i].length;j++)
                {
                    System.out.println(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
public class Elements {
    public static void main(String[] args) {
        ThirdAndFourth rav=new ThirdAndFourth();
        rav.thirdandfourth1(new int[][]{{110,220,330,100},{440,550,660,200},{770,880,990,300},{1110,2220,3330,4000}});
    }
}
