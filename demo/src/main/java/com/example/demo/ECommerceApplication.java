package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommerceApplication implements CommandLineRunner {

    private final IProductDAO productDAO;

    public ECommerceApplication(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public static void main(String[] args) {
        SpringApplication.run(ECommerceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear y guardar productos
        productDAO.create(1, "Coca Cola", 100.50);
        productDAO.create(2, "Arroz", 200.75);
        productDAO.create(3, "Aceite", 300.80);
        productDAO.create(4, "Cereales", 150.25);

        // Obtener y mostrar un producto
        System.out.println("Producto obtenido: " + productDAO.read(1));

        // Actualizar un producto
        productDAO.update(1, "Coca Cola Zero", 110.50);
        System.out.println("Producto actualizado: " + productDAO.read(1));

        // Listar todos los productos
        System.out.println("Listado de todos los productos:");
        System.out.println(productDAO.listAll());

        // Eliminar un producto
        productDAO.delete(2);
        System.out.println("Producto eliminado. Listado actualizado:");
        System.out.println(productDAO.listAll());
    }
}

//detener servicio 8080
//netstat -aon | findstr :8080
//taskkill /PID <PID> /F

