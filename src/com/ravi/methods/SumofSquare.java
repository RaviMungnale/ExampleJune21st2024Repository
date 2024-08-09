package com.ravi.methods;
class Square
{
    void square()
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            int square=i*i;
            sum=sum+square;
        }
        System.out.println(sum+" ");
    }
}
public class SumofSquare {
    public static void main(String[] args) {
        Square rav= new Square();
        rav.square();
    }
}
