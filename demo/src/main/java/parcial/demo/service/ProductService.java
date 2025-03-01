package parcial.demo.service;

import java.util.List;

import parcial.demo.model.Producto;

public interface ProductService {
    public void saveProducto(Producto producto);
    public Producto getProducto(Integer id);
    public List<Producto> getAllProductos();
    
    
} 