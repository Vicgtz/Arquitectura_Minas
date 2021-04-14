/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Semaforo;
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
public class CRUDsemaforo extends CRUD<Semaforo> {

    @Override
    public void guardar(Semaforo entidad) {
       try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `mina`.`semaforo` (`clave`, `ubicacion`, `estado`) VALUES ('%s', '%s', '%s');", 
                    entidad.getClave(), entidad.getUbicacion(), entidad.getEstado());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
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
            java.sql.Statement comando = conexion.createStatement();
            String sql = "SELECT idsemaforo, clave, ubicacion, estado FROM mina.semaforo;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idsemaforo");
                String clave = resultado.getString("clave");
                String ubicacion = resultado.getString("ubicacion");
                String estado = resultado.getString("estado");
                
                Semaforo p = new Semaforo(id, clave, ubicacion, estado);
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
    public Semaforo ObtenerUno(String textoBusqueda) {
         ArrayList<Semaforo> listaP = new ArrayList<>();
        try{            
            java.sql.Connection conexion = this.getConexion();
            java.sql.Statement comando = conexion.createStatement();
            String sql = "SELECT idsemaforo, clave, ubicacion, estado FROM mina.semaforo;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idsemaforo");
                String clave = resultado.getString("clave");
                String ubicacion = resultado.getString("ubicacion");
                String estado = resultado.getString("estado");
                
                Semaforo p = new Semaforo(id, clave, ubicacion, estado);
                listaP.add(p);
            }
            conexion.close();
            for(Semaforo p : listaP)
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
