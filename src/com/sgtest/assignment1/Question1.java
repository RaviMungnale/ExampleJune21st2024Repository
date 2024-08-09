package com.sgtest.assignment1;
class Restaurant {
    String RestaurantName;
    String RestaurantType;
    long contact;

    Restaurant() {
        RestaurantName = "Ravi's Kitchen";
        RestaurantType = "Multicuisine";
        contact = 8080490843L;
        System.out.println("RestaurantName:" + RestaurantName);
        System.out.println("RestaurantType:" + RestaurantType);
        System.out.println("contact:" + contact);
        System.out.println();
    }
}
class FoodDelivery {
    String name;
    String type;
    long contact;

    FoodDelivery() {
        name = "Simahato";
        type = "slow";
        contact = 9876543210L;
        System.out.println("name:" + name);
        System.out.println("type:" + type);
        System.out.println("contact:" + contact);
        System.out.println();
    }

}
public class Question1 {
    public static void main(String[] args) {
        Restaurant obj1=new Restaurant();
        FoodDelivery obj2= new FoodDelivery();
    }
}
