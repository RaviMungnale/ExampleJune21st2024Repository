package com.ravi.returnvalues;
class FavoriteColor
{
    String FavColour(String Colour)
    {
        return Colour;
    }
}
public class FavColor {
    public static void main(String[] args) {
        FavoriteColor rav=new FavoriteColor();
        String r=rav.FavColour("Kesari");
        System.out.println(r);
    }
}
