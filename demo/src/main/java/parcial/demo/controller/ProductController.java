package parcial.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import parcial.demo.model.Producto;
import parcial.demo.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {

    @Autowired
    private ProductService pserv;

    @PostMapping
    public HttpStatus saveProducto(@RequestBody Producto producto) {
        pserv.saveProducto(producto);
        return HttpStatus.CREATED;
    }
    
    @GetMapping
    public ResponseEntity<List<Producto>> getAllProductos() {
    
        ResponseEntity<List<Producto>> response = new ResponseEntity<>(pserv.getAllProductos(), HttpStatus.OK);
        return response;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> getMethodName(@RequestParam Integer id) {
        ResponseEntity<Producto> response = new ResponseEntity<>(pserv.getProducto(id),HttpStatus.OK);
        return response;
    }
    
    

}
