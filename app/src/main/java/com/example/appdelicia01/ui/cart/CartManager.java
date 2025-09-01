package com.example.appdelicia01.ui.cart;

import com.example.appdelicia01.domain.model.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CartManager {
    private static CartManager INSTANCE;
    private final Map<String,Integer> items = new LinkedHashMap<>(); // id -> qty
    private final Map<String, Product> index = new HashMap<>();
    private CartManager(){}
    public static synchronized CartManager get(){ return INSTANCE==null?
            (INSTANCE=new CartManager()):INSTANCE; }

    public void indexProducts(List<Product> products){ for (Product p:products)
        index.put(p.getId(), p); }
    public void add(String productId){ items.put(productId,
            items.getOrDefault(productId,0)+1); }
    public void removeOne(String productId){
        if(!items.containsKey(productId)) return;
        int q = items.get(productId)-1; if(q<=0) items.remove(productId); else
            items.put(productId,q);
    }
    public List<Product> products(){ return
            items.keySet().stream().map(index::get).collect(Collectors.toList()); }
    public int qtyOf(String productId){ return items.getOrDefault(productId,0); }
    public double total(){
        double sum=0;
        for(String id: items.keySet()){ sum += index.get(id).getPrice()*items.get(id); } //estructurada
        return sum;
    }
    public void clear(){ items.clear(); }
}