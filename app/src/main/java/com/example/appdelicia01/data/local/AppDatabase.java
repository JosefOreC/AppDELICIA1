package com.example.appdelicia01.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.appdelicia01.data.local.entities.ProductEntity;

// Define la versión de la base de datos y las entidades que contiene
@Database(entities = {ProductEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    // Proporciona acceso al DAO
    public abstract ProductDao productDao();
    // Más DAOs (ej. UserDao, CartDao) irían aquí
}