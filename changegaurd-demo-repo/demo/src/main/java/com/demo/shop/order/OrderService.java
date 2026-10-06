package com.demo.shop.order;

import com.demo.shop.payment.PaymentService;

public class OrderService {

    private final PaymentService paymentService;

    public OrderService() {
        this.paymentService = new PaymentService();
    }

    public void placeOrder(String orderId) {
        System.out.println("Creating order: " + orderId);

        boolean paid = paymentService.processPayment(orderId);

        if (paid) {
            System.out.println("Order placed successfully");
        } else {
            System.out.println("Order payment failed");
        }
    }
}