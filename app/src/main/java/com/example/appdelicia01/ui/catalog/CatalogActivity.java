package com.example.appdelicia01.ui.catalog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button; // Lo mantienes si usas Button para Login
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdelicia01.R;
import com.example.appdelicia01.data.SampleData;
import com.example.appdelicia01.domain.model.Product;
import com.example.appdelicia01.ui.cart.CartActivity;
import com.example.appdelicia01.ui.cart.CartManager;
import com.example.appdelicia01.ui.auth.LoginActivity; // Importación para Login

import com.google.android.material.floatingactionbutton.FloatingActionButton; // NUEVA IMPORTACIÓN

import java.util.List;

public class CatalogActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_catalog);
        List<Product> items = SampleData.products();
        CartManager.get().indexProducts(items);

        RecyclerView rv = findViewById(R.id.rvProducts);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ProductAdapter(items, new ProductAdapter.Listener() {
            @Override public void onAdd(Product p) {
                CartManager.get().add(p.getId());
                Toast.makeText(CatalogActivity.this, "Agregado: "+p.getName(),
                        Toast.LENGTH_SHORT).show();
            }
            @Override public void onShare(Product p) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, p.getName()+" – S/ "+p.getPrice());
                startActivity(Intent.createChooser(share, "Compartir producto"));
            }
        }));

        // 1. CONEXIÓN DEL BOTÓN FLOTANTE (FAB)
        FloatingActionButton fabCart = findViewById(R.id.fabCart); // NUEVO ID
        fabCart.setOnClickListener(v -> {
            startActivity(new Intent(CatalogActivity.this, CartActivity.class));
        });

        // 2. CONEXIÓN DEL BOTÓN DE LOGIN/PERFIL (ID btnGoToLogin)
        Button btnLogin = findViewById(R.id.btnGoToLogin); // ID CORREGIDO
        btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(CatalogActivity.this, LoginActivity.class));
        });

        // 3. (Opcional) Remueve el antiguo atajo onLongClick si ya no lo necesitas
        // findViewById(android.R.id.content).setOnLongClickListener(...);
    }
}