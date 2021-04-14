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
public class usuario1 {
    private Integer id; 
    private String nombre;
    private String puesto;
    private String pass;

    public usuario1(Integer id, String nombre, String puesto, String pass) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.pass = pass;
    }
    
    public usuario1(Integer id) {
        this.id = id;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "usuario{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", pass=" + pass + '}';
    }
    
    
    
    
}
