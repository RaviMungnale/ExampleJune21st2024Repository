package com.ravi.mocktest;
class StaticBlock
{

        static
        {
            System.out.println("This is the Static Method");
        }
    }
class StaticBlock2
{
    static
    {
        System.out.println("This is the second static Method");
    }
}
public class Question1 {
    public static void main(String[] args) {
        StaticBlock rav=new StaticBlock();
        StaticBlock2 rav2=new StaticBlock2();
    }
}
