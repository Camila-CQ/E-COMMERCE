package com.example.demo;

public class DBAdapterFactory {
    public static IProductDAO getDBAdapter(String dbType) {
        if (dbType.equals("MySQL")) {
            return new MySQLProductDAO();
        } else if (dbType.equals("Oracle")) {
            return new OracleProductDAO();
        }
        return null; 
    }
}
