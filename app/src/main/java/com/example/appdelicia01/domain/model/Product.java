package com.example.appdelicia01.domain.model;

public class Product {
    private final String id, name; private final double price; private final String
            imageUrl;
    public Product(String id, String name, double price, String imageUrl) {
        this.id=id; this.name=name; this.price=price; this.imageUrl=imageUrl;
    }
    public String getId(){return id;} public String getName(){return name;}
    public double getPrice(){return price;} public String getImageUrl(){return imageUrl;}
}

