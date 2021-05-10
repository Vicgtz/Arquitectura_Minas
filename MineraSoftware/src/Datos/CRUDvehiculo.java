/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

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
public class CRUDvehiculo extends CRUD<vehiculo> {

    @Override
    public void guardar(vehiculo entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "INSERT INTO mina.vehiculo (clave, ubicacion, estado, material, cantidadmaterial) VALUES (?,?,?,?,?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, entidad.getClave());
            ps.setString(2, entidad.getUbicacion());
            ps.setString(3, entidad.getEstado());
            ps.setString(4, entidad.getMaterial());
            ps.setString(5, entidad.getCantidadMaterial());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(vehiculo entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<vehiculo> obtener() {
         ArrayList<vehiculo> listaP = new ArrayList<>();
        try{            
            java.sql.Connection conexion = this.getConexion();
            String sql = "SELECT * FROM mina.vehiculo;";
             PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {                
                int id = rs.getInt(1);
                String clave = rs.getString(2);
                String ubicacion = rs.getString(3);
                String estado = rs.getString(4);
                String material = rs.getString(5);
                String cantidad = rs.getString(6);
                
                
               listaP.add(new vehiculo(id, clave, ubicacion, estado, material, cantidad)) ;
                
            }
            conexion.close();
            
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            
        }
        
        return listaP;
    }

    @Override
    public vehiculo ObtenerUno(String textoBusqueda) {
       vehiculo s = null;
         try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM mina.vehiculo WHERE idvehiculo = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(textoBusqueda));
            ResultSet rs = ps.executeQuery();

            

            rs.next();
              int id = rs.getInt(1);
                String clave = rs.getString(2);
                String ubicacion = rs.getString(3);
                String estado = rs.getString(4);
                String material = rs.getString(5);
                String cantidad = rs.getString(6);
                
                
               s = new vehiculo(id, clave, ubicacion, estado, material, cantidad) ;
                
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    return s;
    }
}
