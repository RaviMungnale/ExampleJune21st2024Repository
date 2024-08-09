package com.ravi.practice;
class Employee1
{
    String firstName;
    String jobName;
    Employee1(String fn,String jobName )
    {
        firstName=fn;
        this.jobName=jobName;
        System.out.println("First Name:"+fn);
        System.out.println("Job Name:"+jobName);
    }
}
class Department1 extends Employee1
{
    String deptName;
    Department1(String first,String job,String deptName)
    {
        super(first,job);
        this.deptName=deptName;
        System.out.println("Department Name:"+deptName);
    }
}
public class ParametrizedConstructorInheritance {
    public static void main(String[] args) {
        Department1 rav=new Department1("Aarvi","Pilot","Aviation");
        Department1 rav1=new Department1("Ravi","Automation Tester","QA");
    }
}
