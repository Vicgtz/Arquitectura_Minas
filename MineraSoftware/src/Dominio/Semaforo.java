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
public class Semaforo {
    private Integer id;
    private String clave; 
    private String ubicacion;
    private String estado;

    public Semaforo(Integer id, String clave, String ubicacion, String estado) {
        this.id = id;
        this.clave = clave;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }
    
    public Semaforo(Integer id, String clave, String ubicacion) {
        this.id = id;
        this.clave = clave;
        this.ubicacion = ubicacion;
       
    }
    
    public Semaforo(Integer id) {
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

    @Override
    public String toString() {
        return "Semaforo{" + "id=" + id + ", clave=" + clave + ", ubicacion=" + ubicacion + ", estado=" + estado + '}';
    }
    
    
    
}
