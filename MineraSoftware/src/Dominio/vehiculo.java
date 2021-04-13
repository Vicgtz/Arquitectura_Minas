/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author DELL
 */
public class vehiculo {
     private Integer id; 
     private String clave;
     private String ubicacion; 
     private String estado; 
     private String material;
     private String cantidadMaterial;

    public vehiculo(Integer id, String clave, String ubicacion, String material, String cantidadMaterial) {
        this.id = id;
        this.clave = clave;
        this.ubicacion = ubicacion;
        this.material = material;
        this.cantidadMaterial = cantidadMaterial;
    }
     
    public vehiculo(Integer id, String clave) {
        this.id = id;
        this.clave = clave;
        
    }
    
    public vehiculo(Integer id) {
        this.id = id;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCantidadMaterial() {
        return cantidadMaterial;
    }

    public void setCantidadMaterial(String cantidadMaterial) {
        this.cantidadMaterial = cantidadMaterial;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "id=" + id + ", clave=" + clave + ", ubicacion=" + ubicacion + ", estado=" + estado + ", material=" + material + ", cantidadMaterial=" + cantidadMaterial + '}';
    }
     
     
    
    
    
}
