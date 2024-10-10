package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductDAOFactory {

    @Bean
    public IProductDAO productDAO() {
        String dbConfig = "Oracle"; // Cambiar a Oracle para simular Oracle

        if ("MySQL".equalsIgnoreCase(dbConfig)) {
            return new MySQLProductDAO();
        } else if ("Oracle".equalsIgnoreCase(dbConfig)) {
            return new OracleProductDAO();
        }
        throw new IllegalArgumentException("Base de datos no soportada");
    }
}
