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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CRUDusuario extends CRUD<usuario1>{

   @Override
    public void guardar(usuario1 entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "INSERT INTO mina.usuario (nombre, puesto, pass) VALUES (?,?,?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getPuesto());
           
           
            ps.setString(3, entidad.getPass());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } 
    }

    @Override
    public void eliminar(usuario1 entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<usuario1> obtener() {
        ArrayList<usuario1> listaP = new ArrayList<>();
        try{            
            java.sql.Connection conexion = this.getConexion();
            String sql = "SELECT * FROM mina.usuario;";
             PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {                
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String puesto = rs.getString(3);
                String pas = rs.getString(4);
                
                
                
               listaP.add(new usuario1(id, nombre, puesto, pas)) ;
                
            }
            conexion.close();
            
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            
        }
        
        return listaP;
    }

    @Override
    public usuario1 ObtenerUno(String textoBusqueda) {
        usuario1 s = null;
         try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM mina.usuario WHERE idusuario = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(textoBusqueda));
            ResultSet rs = ps.executeQuery();

            

            rs.next();
              int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String puesto = rs.getString(3);
                String pas = rs.getString(4);
                
                
                
               s = new usuario1(id, nombre, puesto, pas) ;
                
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    return s;
    }
    
    
}
