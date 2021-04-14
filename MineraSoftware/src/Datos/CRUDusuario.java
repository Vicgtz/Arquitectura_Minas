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
         try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `mina`.`usuario` (`nombre`, `puesto`, `pass`) VALUES ('%s', '%s', '%s');", 
                    entidad.getNombre(), entidad.getPuesto(), entidad.getPass());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
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
            java.sql.Statement comando = conexion.createStatement();
            String sql = "SELECT idusuario, nombre, puesto, pass FROM mina.usuario;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idusuario");
                String nombre = resultado.getString("nombre");
                String puesto = resultado.getString("puesto");
                String pass = resultado.getString("pass");
                
                usuario1 p = new usuario1(id,nombre, puesto, pass);
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
    public usuario1 ObtenerUno(String textoBusqueda) {
        ArrayList<usuario1> listaP = new ArrayList<>();
        try{            
            java.sql.Connection conexion = this.getConexion();
            java.sql.Statement comando = conexion.createStatement();
            String sql = "SELECT idusuario, nombre, puesto, pass FROM mina.usuario;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idusuario");
                String nombre = resultado.getString("nombre");
                String puesto = resultado.getString("puesto");
                String pass = resultado.getString("pass");
                
                usuario1 p = new usuario1(id,nombre, puesto, pass);
                listaP.add(p);
            }
            conexion.close();
             for(usuario1 p : listaP)
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
