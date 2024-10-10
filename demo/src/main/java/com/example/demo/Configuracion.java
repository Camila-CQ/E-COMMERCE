package com.example.demo;

public class Configuracion {

    public static IProductDAO configureAdapterDB() {
        String dbType = "Oracle"; // Cambia a "MySQL" si prefieres usar MySQL
        return DBAdapterFactory.getDBAdapter(dbType);
    }
}
