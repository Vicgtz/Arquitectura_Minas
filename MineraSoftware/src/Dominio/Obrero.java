/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author jc
 */
public class Obrero extends Usuario{
    
    private String tarea;

    public Obrero(String tarea, String nombre, String password) {
        super(nombre, password);
        this.tarea = tarea;
    }
        
}
