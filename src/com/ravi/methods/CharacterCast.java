package com.ravi.methods;
class chara1
{
    void CastChar(char a[][])
    {
        int c[][]=new int[a.length][a[0].length];
        int k=0,z=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[k][z]= a[i][j];
                System.out.print(c[k][z]+" ");
            }
            System.out.println();
        }

    }

}
public class CharacterCast {
    public static void main(String[] args) {
        chara1 rav=new chara1();
        rav.CastChar(new char[][]{{'R','A','V'},{'I','N','D'},{'E','R','S'}});

    }
}
