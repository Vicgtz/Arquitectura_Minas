/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Semaforo;
import Dominio.notificaciones;
import Dominio.usuario1;
import Dominio.vehiculo;
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author DELL
 */
public class CRUDNoti extends CRUD<notificaciones>{

    @Override
    public void guardar(notificaciones entidad) {
        try{
            java.sql.Connection conexion = this.getConexion();
            java.sql.Statement comando = conexion.createStatement();           
            String sql = String.format("INSERT INTO `mina`.`notificacionesvehiculo` (`vehiculo`, `mensaje`, `destinatario`, `clave`, `semaforo`, `fecha`) VALUES ('%s', '%s', '%s', '%s', '%s');", 
                    entidad.getVehiculo(), entidad.getMensaje(), entidad.getDestinatario(), entidad.getClave(), entidad.getSemaforo());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        } 
    }

    @Override
    public void eliminar(notificaciones entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<notificaciones> obtener() {
        ArrayList<notificaciones> listaP = new ArrayList<>();
        try{            
            java.sql.Connection conexion = this.getConexion();
            java.sql.Statement comando = conexion.createStatement();
            String sql = "SELECT idnotificacionesvehiculo, vehiculo, mensaje, destinatario, clave, semaforo, fecha FROM mina.notificacionesvehiculo;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idnotificacionesvehiculo");
                int vehiculo = resultado.getInt("vehiculo");
                String mensaje = resultado.getString("mensaje");
                int destinatario = resultado.getInt("destinatario");
                String clave = resultado.getString("clave");
                int semaforo = resultado.getInt("semaforo");
                Date fecha = resultado.getDate("fecha");
                
                vehiculo v =(vehiculo) new CRUDvehiculo().ObtenerUno(vehiculo+"");
                Semaforo s =(Semaforo) new CRUDsemaforo().ObtenerUno(semaforo+"");
                usuario1 u = (usuario1) new CRUDusuario().ObtenerUno(destinatario+"");
                notificaciones p = new notificaciones(id, v, mensaje, u, clave, s, fecha);
                listaP.add(p);
            }
            conexion.close();
            return listaP;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaP;
        }
    }

    @Override
    public notificaciones ObtenerUno(String textoBusqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
