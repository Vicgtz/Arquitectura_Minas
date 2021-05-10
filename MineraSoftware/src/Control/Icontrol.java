/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Dominio.Semaforo;
import Dominio.notificaciones;
import Dominio.usuario1;
import Dominio.vehiculo;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface Icontrol {
   
    public  ArrayList<notificaciones> obtenerNotificaciones();
    
    public  ArrayList<Semaforo> obtenerSemaforo();
    
    public  ArrayList<vehiculo> obtenerVehiculo();
    
    public  ArrayList<usuario1> obtenerUsuario();
    
    public void guardarNotificaciones(ArrayList<notificaciones> noti);
    
    public  void guardarSemaforo(ArrayList<Semaforo> semaforo);
    
    public void guardarVehiculo(ArrayList<vehiculo> vehiculo);
    
    public void guardarUsuario(usuario1 usuario);
    
    
    
   
    
    
}
