package com.example.appdelicia01.data;


import com.example.appdelicia01.domain.model.Product;
import java.util.Arrays;
import java.util.List;

public class SampleData {
    public static List<Product> products() {
        return Arrays.asList(
                new Product("p1","Torta de Chocolate",45.5,""),
                new Product("p2","Cheesecake de Fresas",39.9,""),
                new Product("p3","Pie de Manzana",32.0,"")
        );
    }
}
