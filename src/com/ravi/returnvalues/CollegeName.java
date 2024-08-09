package com.ravi.returnvalues;
class ShowCollegeName
{
    String collegeName(String name)
    {
        return name;
    }
}
public class CollegeName{
    public static void main(String[] args) {
        ShowCollegeName rav= new ShowCollegeName();
        String r=rav.collegeName("PDA College of Engg");
        System.out.println(r);
    }
}
