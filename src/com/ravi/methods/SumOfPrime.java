package com.ravi.methods;
class PrimeSum
{
    void sumprime()
    {
        int num=100;
        int f;
        int sum=0;
        for(int i=200;i>=num;i--) {
            f=0;
            for(int j=2;j<i/2;j++) {
                if(i % j == 0) {
                    f++;
                    break;
                }
            }
            if(f == 0) {
                sum=sum+i;
            }
        }
        System.out.println("Sum of Prime Numbers from 200 to 100:"+sum);
    }
}
public class SumOfPrime {
    public static void main(String[] args) {
        PrimeSum rav= new PrimeSum();
        rav.sumprime();
    }
}
