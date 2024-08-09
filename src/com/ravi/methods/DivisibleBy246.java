package com.ravi.methods;
class Divisible200
{
    void divisible400()
    {
        int count=0;
        for(int i=200;i<=400;i++)
        {
            if ((i % 2 == 0) && (i % 4==0)&&(i%6==0))
            {
                count++;
            }
        }
        System.out.println("Count of numbers divisible by 2,4,6:"+count);
    }

}
public class DivisibleBy246 {
    public static void main(String[] args) {
        Divisible200 rav=new Divisible200();
        rav.divisible400();
    }
}
