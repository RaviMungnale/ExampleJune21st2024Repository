package com.ravi.inheritance;
class University
{
    void universe(String name)
    {
        System.out.println("University Name:"+name);
    }
}
class College extends University
{
    void Clg(String hesru)
    {
        System.out.println("College Name:"+hesru);
    }
}
class Student extends College
{
    void Std(String peru)
    {
        System.out.println("Student Name:"+peru);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Student rav=new Student();
        rav.Std("Ravi");
        rav.Clg("PDACEG");
        rav.universe("VTU");
    }
}