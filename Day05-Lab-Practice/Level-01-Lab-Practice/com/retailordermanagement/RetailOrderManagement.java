package com.retailordermanagement;

// Main class to demonstrate Multilevel Inheritance
public class RetailOrderManagement {
     public static void main(String[] args) {
          // Creating an object for base class Order
          Order order = new Order("O123", "2025-01-01");
          System.out.println("Base Class (Order):");
          order.displayOrderDetails();
          System.out.println("Order Status: " + order.getOrderStatus());
          System.out.println();

          // Creating an object for subclass ShippedOrder
          ShippedOrder shippedOrder = new ShippedOrder("O124", "2025-01-02", "TRACK5678");
          System.out.println("Subclass (ShippedOrder):");
          shippedOrder.displayOrderDetails();
          System.out.println("Order Status: " + shippedOrder.getOrderStatus());
          System.out.println();

          // Creating an object for subclass DeliveredOrder
          DeliveredOrder deliveredOrder = new DeliveredOrder("O125", "2025-01-03", "TRACK9876", "2025-01-05");
          System.out.println("Subclass (DeliveredOrder):");
          deliveredOrder.displayOrderDetails();
          System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
     }
}

