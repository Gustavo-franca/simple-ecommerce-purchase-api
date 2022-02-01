package com.simpleecommerce.purchaseorderapi.entities;

import org.springframework.data.annotation.Id;

public class PurchaseOrder {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public PurchaseOrder() {}

    public PurchaseOrder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
