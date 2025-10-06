package com.example.appdelicia01.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appdelicia01.R;
import com.example.appdelicia01.ui.profile.ProfileActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Lógica de navegación simple al ProfileActivity después de "login"
        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString();
            String password = etPassword.getText().toString();

            // Simulación de validación simple por ahora
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Ingresa tu email y contraseña", Toast.LENGTH_SHORT).show();
            } else {
                // Navegar a ProfileActivity
                startActivity(new Intent(LoginActivity.this, ProfileActivity.class));
                finish(); // Opcional: remover Login de la pila después de un login exitoso
            }
        });
    }
}