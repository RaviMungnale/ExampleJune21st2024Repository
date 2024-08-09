package com.sgtest.Assignment;
class Customer1
{
    String Cname;
    String Address;
    String PhoneNum;
    String Email_Id;
    Customer1()
    {
        Cname = "Chandru";
        Address = "Hampinagar,Bangalore-512010";
        PhoneNum = "+91 6070563780";
        Email_Id = "chandu97@yahoo.com";
        System.out.println("Customer Details");
        System.out.println("Name:" + Cname);
        System.out.println("Address:" + Address);
        System.out.println("Contact Number:" + PhoneNum);
        System.out.println("Email ID" + Email_Id);
        System.out.println("-------------------------------------------");
    }
}
class Project1
{
    String pname;
    String pcity;
    String Req_Tech;
    int timeline;
    Project1()
    {
        pname = "Master Plan";
        pcity = "Udupi";
        Req_Tech = "ArcGIS,QGIS";
        timeline = 2;
        System.out.println("Project Details");
        System.out.println("Name:" + pname);
        System.out.println("City:" + pcity);
        System.out.println("Required Technology:" + Req_Tech);
        System.out.println("Timeline to Finish: " + timeline + " Years");
        System.out.println("-------------------------------------------");
    }
}
class Task1
{
    int tId;
    String tname;
    String Status;
    String Priority;
    Task1()
    {
        tId = 1234;
        tname = "Create Bank Account";
        Status = "Pending";
        Priority = "High";
        System.out.println("Task Details");
        System.out.println("Task ID:" + tId);
        System.out.println("Task Name:" + tname);
        System.out.println("Task Status:" + Status);
        System.out.println("Priority is :" + Priority);
    }
}
public class NoArgs_Customer {
    public static void main(String[] args) {
        Customer1 cs1 = new Customer1();
        Project1 p1=new Project1();
        Task1 T1 = new Task1();
    }
}
