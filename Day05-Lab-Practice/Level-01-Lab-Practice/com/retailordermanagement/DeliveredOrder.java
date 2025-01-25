package com.retailordermanagement;

// Defining the subclass DeliveredOrder that extends ShippedOrder
public class DeliveredOrder extends ShippedOrder {
     // Declaring the delivery date
     private String deliveryDate;

     // Constructor to initialize DeliveredOrder object
     public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
          // Calling the superclass constructor to set orderId, orderDate, and trackingNumber
          super(orderId, orderDate, trackingNumber);
          this.deliveryDate = deliveryDate;
     }

     // Overriding the displayOrderDetails method to include delivery information
     @Override
     public void displayOrderDetails() {
          // Calling the superclass method to display shipped order details
          super.displayOrderDetails();
          System.out.println("Delivery Date: " + deliveryDate);
     }

     // Overriding the getOrderStatus method for delivered order
     @Override
     public String getOrderStatus() {
          return "Order delivered.";
     }
}
