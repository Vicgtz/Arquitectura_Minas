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
public class Administrador extends Usuario{
    
    private String area;

    public Administrador(String area, String nombre, String password) {
        super(nombre, password);
        this.area = area;
    }   
    
    public void GenerarReporteAccidentes(){
        
    }
    
    public void GenerarReporteCongestiones(){
        
    }
    
    public void GenerarReporteMateriales(){
        
    }
    
    public void DetectarCongestionamiento(){
        
    }
    
    public void DetectarAccidentes(){
        
    }
    
    public void ControlarSemaforo(){
        
    }
}
