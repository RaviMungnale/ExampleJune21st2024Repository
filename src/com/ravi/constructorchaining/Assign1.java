package com.ravi.constructorchaining;
class  Maths{
    Maths(int a[][],int b[][])
    {
        for(int i=0; i<a.length;i++)
        {
            for(int k=0;k<a[i].length;k++) {
                int res = a[i][k] - b[i][k];
                System.out.print(res + " ");

            }
            System.out.println();
        }
    }
}
public class Assign1 {
    public static void main(String[] args) {
        int x[][]={{60,70,80},{90,100,110}};
        int y[][]={{10,20,30},{40,50,60}};

        Maths o=new Maths(x,y);
    }
}
