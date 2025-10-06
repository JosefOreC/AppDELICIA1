package com.example.appdelicia01.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appdelicia01.R;
import com.example.appdelicia01.ui.catalog.CatalogActivity;

public class ProfileActivity extends AppCompatActivity {
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnLogout = findViewById(R.id.btnLogout);

        // Simulación de "Cerrar Sesión" volviendo al catálogo
        btnLogout.setOnClickListener(v -> {
            Toast.makeText(this, "Sesión cerrada", Toast.LENGTH_SHORT).show();
            // Podrías volver al Splash o al Catálogo, elegimos Catálogo
            startActivity(new Intent(ProfileActivity.this, CatalogActivity.class));
            finish();
        });
        // Aquí se mostraría la info real del usuario
    }
}