package com.retailordermanagement;

// Defining the base class Order
public class Order {
     // Declaring the order ID
     protected String orderId;

     // Declaring the order date
     protected String orderDate;

     // Constructor to initialize Order object
     public Order(String orderId, String orderDate) {
          this.orderId = orderId;
          this.orderDate = orderDate;
     }

     // Method to display order details
     public void displayOrderDetails() {
          System.out.println("Order ID: " + orderId);
          System.out.println("Order Date: " + orderDate);
     }

     // Method to return the current order status (default for base class)
     public String getOrderStatus() {
          return "Order placed.";
     }
}
