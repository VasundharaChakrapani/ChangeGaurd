package com.demo.shop.inventory;

import com.demo.shop.notification.NotificationService;

public class InventoryService {

    private final NotificationService notificationService;

    public InventoryService() {
        this.notificationService = new NotificationService();
    }
    public boolean reserveStock(String orderId) {
        System.out.println("Reserving stock for: " + orderId);
        notificationService.sendNotification(orderId);

        return true;
    }
}