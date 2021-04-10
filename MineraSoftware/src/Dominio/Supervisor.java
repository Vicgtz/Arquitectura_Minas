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
public class Supervisor extends Usuario{
    
    private String area;

    public Supervisor(String area, String nombre, String password) {
        super(nombre, password);
        this.area = area;
    }
    
    public void GenerarReporteAccidentes(){
        
    }
    
    public void GenerarReporteCongestiones(){
        
    }
    
    public void GenerarReporteMateriales(){
        
    }
}
