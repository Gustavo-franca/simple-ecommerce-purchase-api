package com.simpleecommerce.purchaseorderapi.entities;

import org.springframework.data.annotation.Id;

public class Product {
    @Id
    public String id;
    public String title;
    public String imgUrl;
    public String description;
    public Integer quantity;
    public Float price;
    public Integer stock;

    public Product() {

    }

    public Product(String id, String title, String imgUrl, String description, Integer quantity, Float price, Integer stock) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.stock = stock;
    }
}
