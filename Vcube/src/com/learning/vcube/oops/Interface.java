package com.learning.vcube.oops;

interface FoodOrder { 
    void prepareFood(); 
}

class OrderDetails {
    int orderId;
    String customberName;
    double price;

    OrderDetails(int orderId, String customberName, double price) {
        this.orderId = orderId;
        this.customberName = customberName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Order Id : " + orderId);
        System.out.println("Customber Name : " + customberName);
        System.out.println("Price : " + price);
    }
}

class PizzaOrder extends OrderDetails implements FoodOrder {
    PizzaOrder(int orderId, String customberName, double price) {
        super(orderId, customberName, price);
    }

    @Override
    public void prepareFood() {
        System.out.println("Prepare Pizza...");
    }
}

class BurgerOrder extends OrderDetails implements FoodOrder {
    BurgerOrder(int orderId, String customberName, double price) {
        super(orderId, customberName, price);
    }

    @Override
    public void prepareFood() {
        System.out.println("Prepare Burger...");
    }
}

public class Interface {
    public static void main(String[] args) {
        OrderDetails order;
        
        order = new PizzaOrder(101, "Suraj", 250);
        order.displayDetails();
        FoodOrder food = (FoodOrder) order;
        food.prepareFood(); 
        
        System.out.println();
        
        order = new BurgerOrder(102, "Rahul", 180);
        order.displayDetails();
        food = (FoodOrder) order;
        food.prepareFood(); 
    }
}
