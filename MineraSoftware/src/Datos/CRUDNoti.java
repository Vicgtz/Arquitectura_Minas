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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CRUDNoti extends CRUD<notificaciones>{

    @Override
    public void guardar(notificaciones entidad) {
       try {
            java.sql.Connection conexion = this.getConexion();
            String sql = "INSERT INTO mina.notificacionesvehiculo (vehiculo, mensaje, destinatario, clave, semaforo, fecha) VALUES (?,?,?,?,?,?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            java.sql.Date date = new java.sql.Date(entidad.getFecha().getTime());
            
            ps.setInt(1, entidad.getVehiculo().getId());
            ps.setString(2, entidad.getMensaje());          
            ps.setInt(3, entidad.getDestinatario().getId());
            ps.setString(4, entidad.getClave());
            ps.setInt(5, entidad.getSemaforo().getId());
            ps.setDate(6, date);
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
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
           
            String sql = "SELECT * FROM mina.notificacionesvehiculo;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            CRUD sema = new CRUDsemaforo();
            CRUD usu = new CRUDusuario();
            CRUD ve = new CRUDvehiculo();
            while(rs.next())
            {                
                int id = rs.getInt(1);
                vehiculo v = (vehiculo) ve.ObtenerUno(rs.getInt(2) + "");
                String mensaje = rs.getString(3);
                usuario1 u = (usuario1) usu.ObtenerUno(rs.getInt(4) + "");
                String clave = rs.getString(5);
                Semaforo s = (Semaforo) sema.ObtenerUno(rs.getInt(6)+ "");
                java.util.Date fecha = rs.getDate(7);
               
               notificaciones p = new notificaciones(id, v,mensaje,u,clave,s, fecha);
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
