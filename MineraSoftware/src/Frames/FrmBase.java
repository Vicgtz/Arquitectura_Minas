/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import javax.swing.JOptionPane;

/**
 *
 * @author R2
 */
public class FrmBase extends javax.swing.JFrame {

    private static FrmMenu frmMenu;
    private static FrmNotificaciones frmNotificaciones;
    
    /**
     * Creates new form FrmBase
     */
    public FrmBase() {
        initComponents();
    }
    
    //Muestra un mensaje
    protected void mostrarMsg(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    /**
     * Centra la pantalla y ajusta las dimensiones dependiendo de la pantalla en el que se ejecute.
     */
    protected void adaptarPantalla(){
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), this.getWidth(),this.getHeight() );
    }
    
    public static FrmMenu getFrmMenu(){
        if (frmMenu == null) {
            frmMenu = new FrmMenu();
        }
        return frmMenu;
    }
    
    public static FrmNotificaciones getFrmNotificaciones(){
        if(frmNotificaciones == null){
            frmNotificaciones = new FrmNotificaciones();
        }
        return frmNotificaciones;
    }
    
    protected FrmMenu getInstanciaFrmMenu(){
        return getFrmMenu();
    }
    
    protected FrmNotificaciones getInstanciaFrmNotificaciones(){
        return getFrmNotificaciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
