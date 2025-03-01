package parcial.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Producto {
    private Integer id;
    private String nombre;
    private Double precio;

    public Integer getid(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public Double getPrecio(){
        return precio;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setPrecio(Double precio){
        this.precio = precio;
    }

}
