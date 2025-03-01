package parcial.demo.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import parcial.demo.model.Producto;
import parcial.demo.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
    
    List<Producto> productos = new ArrayList<>();

    @Override
    public void saveProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public Producto getProducto(Integer id){
        for(int i = 0; i< productos.size(); i++){
            Producto produc = productos.get(i);
            if(produc.getid() == id){
                return produc;
            }
        }
        return null;

    }

    @Override
    public List<Producto> getAllProductos(){
        return productos;
    }
    

 

}
