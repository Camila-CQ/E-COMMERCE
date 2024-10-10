package com.example.demo.services;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.example.demo.Configuracion;
import com.example.demo.IProductDAO;

@Service
public class ProductService {

    private IProductDAO productDAO = Configuracion.configureAdapterDB();

    public void createProduct(int id, String descripcion, double precio) {
        productDAO.create(id, descripcion, precio);
    }

    public Map<String, Object> getProduct(int id) {
        return productDAO.read(id);
    }

    public void updateProduct(int id, String descripcion, double precio) {
        productDAO.update(id, descripcion, precio);
    }

    public void deleteProduct(int id) {
        productDAO.delete(id);
    }

    public void listAllProducts() {
        productDAO.listAll();
    }
}
