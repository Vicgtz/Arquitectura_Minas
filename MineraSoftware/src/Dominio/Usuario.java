/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author jc
 */
public class Usuario {
    
    private String nombre;
    private String password;
    ArrayList notificaciones = new ArrayList<>();

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(ArrayList notificaciones) {
        this.notificaciones = notificaciones;
    }        
}
