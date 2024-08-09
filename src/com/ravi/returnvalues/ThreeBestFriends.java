package com.ravi.returnvalues;
class TheBestFriends1
{
  String[] BestFriends()
  {
      String s[]={"Punith","Simha","Kiran"};
      return s;
  }
}

public class ThreeBestFriends {
    public static void main(String[] args) {
        TheBestFriends1 rav=new TheBestFriends1();
        String s[]= rav.BestFriends();
        for(String r:s){
            System.out.println(r);
        }
    }
}
