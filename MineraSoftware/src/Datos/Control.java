/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Comunidad del anillo
 */
public class Control {
    private CRUDNoti notificacionC;
    private CRUDsemaforo semaforoC;
    private CRUDusuario usuarioC;
    private CRUDvehiculo vehiculoC;
    
    public Control(){        
    }
    
    public CRUDNoti getCrudNoti(){
        if(this.notificacionC != null)
        {
            return this.notificacionC;
        }
        else
        {
            this.notificacionC = new CRUDNoti();
            return this.notificacionC;
        }
    }
    
    public CRUDsemaforo getCrudSemaforo(){
        if(this.semaforoC != null)
        {
            return this.semaforoC;
        }
        else
        {
            this.semaforoC = new CRUDsemaforo();
            return this.semaforoC;
        }
    }
    public CRUDusuario getCrudUsuario(){
        if(this.usuarioC != null)
        {
            return this.usuarioC;
        }
        else
        {
            this.usuarioC = new CRUDusuario();
            return this.usuarioC;
        }
    }

    public CRUDvehiculo getCrudVehiculo(){
        if(this.vehiculoC != null)
        {
            return this.vehiculoC;
        }
        else
        {
            this.vehiculoC = new CRUDvehiculo();
            return this.vehiculoC;
        }
    }    
    
}
