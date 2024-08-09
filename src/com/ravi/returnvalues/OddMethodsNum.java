package com.ravi.returnvalues;
class OddNumbers
{
    int[] oddNum()
    {
        int s[]={9,11,13,15,17,19};
        return s;

    }
}
public class OddMethodsNum {
    public static void main(String[] args) {
        OddNumbers rav= new OddNumbers();
        int s[]= rav.oddNum();
        for(int val:s)
            System.out.println(val);
    }
}
