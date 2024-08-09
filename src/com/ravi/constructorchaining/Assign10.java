package com.ravi.constructorchaining;
class Maths8
{
    Maths8(int r[][])
    {
        int count=0;
        for(int c[]:r)
        {
            for(int kk:c)
            {
                count=count+1;
            }
        }
        System.out.println(count+" ");
    }
}
public class Assign10 {
    public static void main(String[] args) {
        int b[][]={{20,40,30},{80,10,50},{70,90,60}};
        Maths8 rav=new Maths8(b);
    }

}
