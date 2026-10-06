package com.demo.shop.payment;

import com.demo.shop.inventory.InventoryService;

public class PaymentService {

    private final InventoryService inventoryService;

    public PaymentService() {
        this.inventoryService = new InventoryService();
    }

    public boolean processPayment(String orderId) {
        System.out.println("Processing payment for: " + orderId);

        boolean stockReserved = inventoryService.reserveStock(orderId);

        if (stockReserved) {
            System.out.println("Payment successful");
            return true;
        }

        return false;
    }
}