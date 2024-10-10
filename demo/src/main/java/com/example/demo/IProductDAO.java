package com.example.demo;

import java.util.List;
import java.util.Map;

public interface IProductDAO {
    // Crear producto
    void create(int id, String descripcion, double precio);

    // Leer producto
    Map<String, Object> read(int id);

    // Actualizar producto
    void update(int id, String descripcion, double precio);

    // Eliminar producto
    void delete(int id);

    // Listar todos los productos
    List<Map<String, Object>> listAll();  // Cambiado a retornar una lista de productos
}
