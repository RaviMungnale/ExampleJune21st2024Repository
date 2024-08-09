package com.ravi.methods;
class Tables
{
    void Table1()
    {
        for(int i=1;i<=20;i++) {
            for(int j=1;j<=10;j++) {
                String str=(i +"*"+j +"="+(i*j));
                System.out.println(str);
            }
            System.out.println("~~~~~~~~~~~~~~~~");
        }
    }
}
public class AllTables {
    public static void main(String[] args) {
        Tables rav=new Tables();
        rav.Table1();
    }
}
