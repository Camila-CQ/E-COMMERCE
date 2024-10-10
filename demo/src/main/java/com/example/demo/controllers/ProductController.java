package com.example.demo.controllers;
import com.example.demo.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final IProductDAO productDAO;

    public ProductController(IProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @PostMapping
    public void createProduct(@RequestParam int id, @RequestParam String descripcion, @RequestParam double precio) {
        productDAO.create(id, descripcion, precio);
    }

    @GetMapping("/{id}")
    public Map<String, Object> getProduct(@PathVariable int id) {
        return productDAO.read(id);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable int id, @RequestParam String descripcion, @RequestParam double precio) {
        productDAO.update(id, descripcion, precio);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productDAO.delete(id);
    }

    @GetMapping
    public List<Map<String, Object>> getAllProducts() {
        return productDAO.listAll();  // Retorna la lista de productos
    }
}
