package com.ravi.constructorchaining;
class Maths4
{
    Maths4(char a[][])
    {
        String s=" ";
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<a.length;k++)
            {
                if(k==2)
                {
                    s = s + a[i][k] + " ";
                }
            }
        }
        System.out.println(s+" ");
        System.out.println();
    }
}
public class Assign5 {
    public static void main(String[] args) {
        char b[][]={{'R','A','V'},{'I','N','D'},{'E','R','S'}};
        Maths4 ob1= new Maths4(b);
    }
}
