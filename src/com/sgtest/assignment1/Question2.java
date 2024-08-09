package com.sgtest.assignment1;
class NationalPark {
    String ParkName;
    String ParkType;
    String ParkLocation;

    NationalPark() {
        ParkName = "Punith National Park";
        ParkType = "Wild";
        ParkLocation = "Tumkur";
        System.out.println("Park Name:" + ParkName);
        System.out.println("ParkType:" + ParkType);
        System.out.println("Park Location:" + ParkLocation);
        System.out.println();
    }
}
class ThemePark{
    String ThemeName;
    String ThemeType;
    String ThemeAddress;

    ThemePark()
    {
        ThemeName="Simha Theme Park";
        ThemeType="Aquatic";
        ThemeAddress="Hindupur";
        System.out.println("Theme Name:"+ThemeName);
        System.out.println("Theme Type:"+ThemeType);
        System.out.println("Theme Address:"+ThemeAddress);
    }
}
public class Question2 {
    public static void main(String[] args) {
        NationalPark obj2 = new NationalPark();
        ThemePark obj3 = new ThemePark();

    }
}
