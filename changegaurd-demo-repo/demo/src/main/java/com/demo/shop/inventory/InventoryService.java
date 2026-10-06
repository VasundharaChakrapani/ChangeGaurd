package com.demo.shop.inventory;

import com.demo.shop.notification.NotificationService;

public class InventoryService {

    private final NotificationService notificationService;

    public InventoryService() {
        this.notificationService = new NotificationService();
    }
    public boolean reserveStock(String orderId) {
    System.out.println("Checking stock for: " + orderId);

    boolean stockAvailable = true;

    if (!stockAvailable) {
        System.out.println("Stock unavailable");
        return false;
    }

    notificationService.sendNotification(orderId);

    return true;
}
}