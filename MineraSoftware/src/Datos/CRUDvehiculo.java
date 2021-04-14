/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.usuario1;
import Dominio.vehiculo;
import java.sql.Connection;
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
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `mina`.`vehiculo` (`clave`, `ubicacion`, `estado`, `material`, `cantidadmaterial`) VALUES ('%s', '%s', '%s', '%s', '%s');", 
                    entidad.getClave(), entidad.getUbicacion(), entidad.getEstado(),entidad.getMaterial(),entidad.getCantidadMaterial());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
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
            java.sql.Statement comando = conexion.createStatement();
            String sql = "SELECT idvehiculo, clave, ubicacion, estado, material, cantidadmaterial FROM mina.vehiculo;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idvehiculo");
                String clave = resultado.getString("clave");
                String ubicacion = resultado.getString("ubicacion");
                String estado = resultado.getString("estado");
                String material = resultado.getString("material");
                String cantidadmaterial = resultado.getString("cantidadmaterial");
                
                vehiculo p = new vehiculo(id, clave, ubicacion,estado, material, cantidadmaterial);
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
    public vehiculo ObtenerUno(String textoBusqueda) {
        ArrayList<vehiculo> listaP = new ArrayList<>();
        try{            
            java.sql.Connection conexion = this.getConexion();
            java.sql.Statement comando = conexion.createStatement();
            String sql = "SELECT idvehiculo, clave, ubicacion, estado, material, cantidadmaterial FROM mina.vehiculo;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idvehiculo");
                String clave = resultado.getString("clave");
                String ubicacion = resultado.getString("ubicacion");
                String estado = resultado.getString("estado");
                String material = resultado.getString("material");
                String cantidadmaterial = resultado.getString("cantidadmaterial");
                
                vehiculo p = new vehiculo(id, clave, ubicacion, estado, material, cantidadmaterial);
                listaP.add(p);
            }
            conexion.close();
             for(vehiculo p : listaP)
            {
                String idP = p.getId()+"";
                if(idP.equalsIgnoreCase(textoBusqueda))
                {
                    return p;
                }                
            }
            return null;    
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }
    
}
