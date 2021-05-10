/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Control.Icontrol;
import Control.control;
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
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author R2
 */
public class MainTests {
    
    public static void main(String[] args) throws InterruptedException {
        
         MainTests p = new MainTests();
      Icontrol con = new control();
       for(int i=0; i<10;i++){

        vehiculo v= p.vehiculo();
        Semaforo s= p.semaforo();
        usuario1 u= p.usuario();
        Date f = new Date();
        String mensaje=null;
        v.setEstado(p.estado());
        if(v.getEstado().equalsIgnoreCase("detenido")){
          mensaje = "sin problemas";  
        } else if(v.getEstado().equalsIgnoreCase("movimiento")){
            mensaje = "precaucion";
        } else if(v.getEstado().equalsIgnoreCase("semaforo")){
           mensaje = "sin problemas"; 
        }else if(v.getEstado().equalsIgnoreCase("accidente")){
           mensaje = "Alerta, pruebe vias alternas"; 
        }

        notificaciones n = new notificaciones(v,mensaje,u,v.getClave(),s,f);
        System.out.println(n.toString());
        ArrayList<notificaciones> noti= new ArrayList<>();
        noti.add(n);
        con.guardarNotificaciones(noti);
        TimeUnit.SECONDS.sleep(20);
       }
        
    }
    
    public  Semaforo semaforo(){
        ArrayList<Semaforo> sem = new ArrayList<>();
        CRUD semaforo= new CRUDsemaforo();
        
        sem = semaforo.obtener();
        Random rnd= new Random();
        int numero= (int) Math.floor(rnd.nextFloat()*sem.size());
        
        return sem.get(numero);
    }
    
    public  vehiculo vehiculo(){
        ArrayList<vehiculo> ve = new ArrayList<>();
        CRUD vehiculo= new CRUDvehiculo();
       
        ve = vehiculo.obtener();
        Random rnd= new Random();
        int numero= (int) Math.floor(rnd.nextFloat()*ve.size());
      
        return ve.get(numero);
    }
    
    public  usuario1 usuario(){
        ArrayList<usuario1> us = new ArrayList<>();
        CRUD usuario= new CRUDusuario();
        
        us = usuario.obtener();
        Random rnd= new Random();
        int numero= (int) Math.floor(rnd.nextFloat()*us.size());
        
        return us.get(numero);
    }
    
    public String estado(){
        ArrayList<String> estado= new ArrayList<>();
        
        estado.add("detenido");
        estado.add("movimiento");
        estado.add("semaforo");
        estado.add("accidente");
        Random rnd= new Random();
        int numero= (int) Math.floor(rnd.nextFloat()*estado.size());
        
        return estado.get(numero);
    }
    
}
