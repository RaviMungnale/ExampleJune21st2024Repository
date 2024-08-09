package com.ravi.methods;
class CountsEven
{
    void evn()
    {
        int count=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0){
                count++;
        }

        }
        System.out.println(count);
    }
}
public class CountEven {
    public static void main(String[] args) {
        CountsEven obj1=new CountsEven();
        obj1.evn();
    }
}
