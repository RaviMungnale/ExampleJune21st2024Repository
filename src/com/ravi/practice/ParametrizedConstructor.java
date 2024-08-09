package com.ravi.practice;
class Employee
{
    String firstName;
    String jobName;
    Employee(String fn,String jobName)
    {
        firstName=fn;
        this.jobName=jobName;
        System.out.println("First Name:"+firstName);
        System.out.println("Job Name:"+jobName);
    }
}
class Department extends Employee
{
    Department(String first,String job)
    {
        super(first,job);
    }
}
public class ParametrizedConstructor {
    public static void main(String[] args) {
        Department rav=new Department("Ravi","Automation Tester");

    }
}
