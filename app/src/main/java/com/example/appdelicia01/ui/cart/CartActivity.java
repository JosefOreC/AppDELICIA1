package com.example.appdelicia01.ui.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appdelicia01.R;
import com.example.appdelicia01.domain.model.Product;

import java.util.Locale;

public class CartActivity extends AppCompatActivity {
private LinearLayout container; private TextView txtTotal;
 @Override protected void onCreate(Bundle b){
        super.onCreate(b); setContentView(R.layout.activity_cart);
        container = findViewById(R.id.container); txtTotal =
                findViewById(R.id.txtTotal);

        render();

        findViewById(R.id.btnClear).setOnClickListener(v -> {
            CartManager.get().clear(); render();
             });
        }

         private void render(){
        container.removeAllViews();
        LayoutInflater inf = LayoutInflater.from(this);
         for (Product p: CartManager.get().products()){
             View row = inf.inflate(android.R.layout.simple_list_item_2, container, false);
             ((TextView)row.findViewById(android.R.id.text1)).setText(p.getName());
             ((TextView)row.findViewById(android.R.id.text2))
            .setText("S/ "+p.getPrice()+" x"+CartManager.get().qtyOf(p.getId()));
             row.setOnClickListener(v -> { CartManager.get().add(p.getId()); render(); });
// +1
             row.setOnLongClickListener(v -> { CartManager.get().removeOne(p.getId());
                render(); return true; }); // -1
             container.addView(row);

         }
         txtTotal.setText(String.format(Locale.getDefault(),"Total: S/ %.2f",
                CartManager.get().total()));
        }
 }