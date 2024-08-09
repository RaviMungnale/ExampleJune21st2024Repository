package com.ravi.returnvalues;
class CountryName
{
    String getName(String name)
    {
        return name;
    }
}
public class Country {
    public static void main(String[] args) {
        CountryName rav=new CountryName();
        String r=rav.getName("Bharat");
        System.out.println(r);
    }
}
