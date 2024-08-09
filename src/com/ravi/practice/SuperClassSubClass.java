package com.ravi.practice;
class Parent
{
  int value=10;
  void display()
  {
      System.out.println("Value of Parent:"+value);
  }
}
class Child extends Parent
{
    int value=20;
    void display()
    {
        System.out.println("Value of Child:"+value);
    }
}
void displayParentValue()
{
    System.out.println("Value of parent (Accessed from child:"+super.value);
}


public class SuperClassSubClass {
    public static void main(String[] args) {


    }
}
