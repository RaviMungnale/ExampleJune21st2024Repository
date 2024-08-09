package com.ravi.abstraction;
abstract class University
{
    void Universe(String name)
    {
        System.out.println("University Name:"+name);
    }
}
class College extends University
{
    void clg(int id)
    {
        System.out.println("College Id:"+id);
    }
}
class College2 extends University
{
    void clg2(int id)
    {
        System.out.println("College2 Id:"+id);
    }
}
class Student extends College2
{
    void stud(String name)
    {
        System.out.println("Student Name:"+name);
    }
}
public class HybridInheritanceAbstract {
    public static void main(String[] args) {
        Student rav=new Student();
        rav.stud("Ravinder");
        rav.clg2(195);
        rav.Universe("VTU");

        College rav2=new College();
        rav2.clg(225);
        rav2.Universe("VTU");

    }
}
