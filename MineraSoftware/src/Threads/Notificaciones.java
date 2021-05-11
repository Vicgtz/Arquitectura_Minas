/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import javax.swing.JTable;
import Datos.Control;
import Dominio.notificaciones;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Comunidad del anillo
 */
public class Notificaciones extends Thread{
    JTable  jTable;
    Control control;
    public Notificaciones(JTable tbl){
        this.jTable = tbl;
        this.control = new Control();
    }
    
    @Override
    public void run(){
        while(true)
        {
            try 
            {
                Thread.sleep(2000);
            } catch (InterruptedException ex) 
            {
                ex.printStackTrace();
            }            
            ArrayList<notificaciones> lista = this.control.getCrudNoti().obtener();
            DefaultTableModel modeloTabla = (DefaultTableModel) this.jTable.getModel();
            modeloTabla.setRowCount(0);
            for(notificaciones n : lista)
            {
                Object[] fila = new Object[3];
                fila[0] = n.getVehiculo().getClave();
                /*
                Por alguna razon al momento de obtener el objeto semaforo en
                la consulta este regresa vacío y escribe un mensaje de error
                en consola, debes revisar eso @Victor
                una vez termines eso, descomentarea esa linea. att: Casal
                */
  //            fila[1] = n.getSemaforo().getClave();
                fila[2] = n.getMensaje();
                modeloTabla.addRow(fila);
            }            
        }
    }
    
}
