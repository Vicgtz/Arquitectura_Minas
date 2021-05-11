/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Semaforo;
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
public class CRUDsemaforo extends CRUD<Semaforo> {

   
    @Override
    public void guardar(Semaforo entidad) {
       try {
            Connection conexion = this.getConexion();
            String sql = "INSERT INTO mina.semaforo (clave, ubicacion, estado) VALUES (?,?,?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, entidad.getClave());
            ps.setString(2, entidad.getUbicacion());
            ps.setString(3, entidad.getEstado());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } 
    }

    @Override
    public void eliminar(Semaforo entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Semaforo> obtener() {
         ArrayList<Semaforo> listaP = new ArrayList<>();
        try{            
            java.sql.Connection conexion = this.getConexion();
            String sql = "SELECT * FROM mina.semaforo;";
             PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {               
                int id = rs.getInt(1);
                String clave = rs.getString(2);
                String ubicacion = rs.getString(3);
                String estado = rs.getString(4);
                
                
               listaP.add(new Semaforo(id, clave, ubicacion, estado)) ;
                
            }
            conexion.close();
            
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            
        }
        
        return listaP;
    }

    @Override
    public Semaforo ObtenerUno(String textoBusqueda) {
         Semaforo s = null;
         try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM mina.semaforo WHERE idsemaforo = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(textoBusqueda));
            ResultSet rs = ps.executeQuery();

            

            rs.next();
                int id = rs.getInt(1);
                String clave = rs.getString(2);
                String marca = rs.getString(3);
                String invernadero = rs.getString(4);
               
                
                
               s = new Semaforo(id, clave, marca, invernadero) ;
                
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    return s;
    }
    
}
