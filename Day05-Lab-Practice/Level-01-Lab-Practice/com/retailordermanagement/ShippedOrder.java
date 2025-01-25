package com.retailordermanagement;

// Defining the subclass ShippedOrder that extends Order
public class ShippedOrder extends Order {
     // Declaring the tracking number
     protected String trackingNumber;

     // Constructor to initialize ShippedOrder object
     public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
          // Calling the superclass constructor to set orderId and orderDate
          super(orderId, orderDate);
          this.trackingNumber = trackingNumber;
     }

     // Overriding the displayOrderDetails method to include tracking information
     @Override
     public void displayOrderDetails() {
          // Calling the superclass method to display common order details
          super.displayOrderDetails();
          System.out.println("Tracking Number: " + trackingNumber);
     }

     // Overriding the getOrderStatus method for shipped order
     @Override
     public String getOrderStatus() {
          return "Order shipped.";
     }
}

