package com.ravi.returnvalues;
class Dishes1
{
    String[] getDishes() {
        String s[] = {"Khushka", "Kebab", "Pepsi" };
        return s;

    }
}
public class FavoriteDishes {
    public static void main(String[] args) {
        Dishes1 rav= new Dishes1();
        String dishes[]=rav.getDishes();
        for(String val:dishes){
            System.out.println(val);
        }
    }
}
