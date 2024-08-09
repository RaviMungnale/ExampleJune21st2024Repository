package com.ravi.constructorchaining;
class Maths2{
    Maths2(String a[][])
    {
        String str=" ";
        for(int i=0;i<a.length;i++)
        {
            for(int k=0; k<a.length;k++)
            {
                if(i==1)
                {
                    str=str + a[i][k] + " ";
                }
            }
        }
        System.out.print(str+" ");
        System.out.println();
    }
}
public class Assign3 {
    public static void main(String[] args) {
        String x[][] = {{"Ravi","Punith","Simha",},{"Shree","Dhanu","Aruna"},{"Nice","Sunita","Harshith"}};
        Maths2 o1 = new Maths2(x);

    }
}
