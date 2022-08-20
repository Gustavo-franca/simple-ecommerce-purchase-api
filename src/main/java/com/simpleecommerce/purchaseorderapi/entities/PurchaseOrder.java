package com.simpleecommerce.purchaseorderapi.entities;

import org.springframework.data.annotation.Id;

public class PurchaseOrder {
    @Id
    public String id;

    public Product[] products;

    public PurchaseOrder() {}

    public PurchaseOrder(Product[] products) {
        this.products = products;
    }

    public PurchaseOrder(String id, Product[] products) {
        this.id = id;
        this.products = products;
    }
}
