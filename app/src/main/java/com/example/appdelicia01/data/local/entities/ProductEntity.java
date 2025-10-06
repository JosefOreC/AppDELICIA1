package com.example.appdelicia01.data.local.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Mapea la tabla 'products' en la base de datos
@Entity(tableName = "products")
public class ProductEntity {
    @PrimaryKey
    public String id; // Usamos el ID del dominio
    public String name;
    public double price;
    public String imageUrl;

    public ProductEntity(String id, String name, double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }
}