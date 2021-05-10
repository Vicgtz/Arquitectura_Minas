/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Datos.CRUD;
import Datos.CRUDNoti;
import Datos.CRUDsemaforo;
import Datos.CRUDusuario;
import Datos.CRUDvehiculo;
import Dominio.Semaforo;
import Dominio.notificaciones;
import Dominio.usuario1;
import Dominio.vehiculo;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class control implements Icontrol {

    CRUD n= new CRUDNoti();
    CRUD s= new CRUDsemaforo();
    CRUD v= new CRUDvehiculo();
    CRUD u= new CRUDusuario();
    
    @Override
    public ArrayList<notificaciones> obtenerNotificaciones() {
     ArrayList<notificaciones> noticias = n.obtener();
     return noticias;
    }

    @Override
    public ArrayList<Semaforo> obtenerSemaforo() {
     ArrayList<Semaforo> semaforo = s.obtener();
     return semaforo;
    }

    @Override
    public ArrayList<vehiculo> obtenerVehiculo() {
        ArrayList<vehiculo> vehi = v.obtener();
     return vehi;
    }

    @Override
    public ArrayList<usuario1> obtenerUsuario() {
        ArrayList<usuario1> usuario = u.obtener();
     return usuario;
    }

    @Override
    public void guardarNotificaciones(ArrayList<notificaciones> noti) {
       for(int i=0; i<noti.size();i++){
          notificaciones noticia= noti.get(i);
          n.guardar(noticia);
       }
       
    }

    @Override
    public void guardarSemaforo(ArrayList<Semaforo> semaforo) {
         for(int i=0; i<semaforo.size();i++){
          Semaforo sem= semaforo.get(i);
          s.guardar(sem);
       }
    }

    @Override
    public void guardarVehiculo(ArrayList<vehiculo> vehiculo) {
        for(int i=0; i<vehiculo.size();i++){
         vehiculo ve= vehiculo.get(i);
          v.guardar(ve);
       } 
    }

    @Override
    public void guardarUsuario(usuario1 usuario) {
        u.guardar(usuario);
    }
    
}
