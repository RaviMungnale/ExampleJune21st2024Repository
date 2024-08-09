package com.ravi.returnvalues;
class EvenNumbers
{
    int[] showNum()
    {
        int s[]={10,12,14,16,18,20};
        return s;
    }
}
public class EvenMethodsNum {
    public static void main(String[] args) {
        EvenNumbers rav= new EvenNumbers();
        int s[]=rav.showNum();
        for(int val:s)

            System.out.println(val);


    }

}
