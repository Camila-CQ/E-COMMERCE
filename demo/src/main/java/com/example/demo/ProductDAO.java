package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO implements IProductDAO {
    private final Map<Integer, Map<String, Object>> products = new HashMap<>();

    @Override
    public void create(int id, String descripcion, double precio) {
        Map<String, Object> product = new HashMap<>();
        product.put("id", id);
        product.put("descripcion", descripcion);
        product.put("precio", precio);
        products.put(id, product);
        System.out.println("Producto creado: " + product);
    }

    @Override
    public Map<String, Object> read(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, String descripcion, double precio) {
        Map<String, Object> product = products.get(id);
        if (product != null) {
            product.put("descripcion", descripcion);
            product.put("precio", precio);
            System.out.println("Producto actualizado: " + product);
        }
    }

    @Override
    public void delete(int id) {
        products.remove(id);
        System.out.println("Producto eliminado: " + id);
    }

    @Override
    public List<Map<String, Object>> listAll() {
        return new ArrayList<>(products.values());
    }
}
