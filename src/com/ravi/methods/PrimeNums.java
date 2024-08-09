package com.ravi.methods;
class PrimeNu1
{
    void Prime1()
    {
        int num=50;
        int f;
        for(int i=1;i<=num;i++)
        {
            f=0;
            for(int j=2;j<i/2;j++)
            {
                if(i % j ==0){
                    f++;
                    break;
                }
            }
            if(f==0){
                System.out.println(i);
            }
        }
    }
}
public class PrimeNums {
    public static void main(String[] args) {
        PrimeNu1 rav=new PrimeNu1();
        rav.Prime1();
    }
}
