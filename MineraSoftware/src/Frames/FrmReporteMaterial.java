/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author R2
 */
public class FrmReporteMaterial extends FrmBase {

    /**
     * Creates new form FrmReporteMaterial
     */
    public FrmReporteMaterial() {
        initComponents();
        adaptarPantalla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnNotificaciones = new javax.swing.JButton();
        BtnMaterial = new javax.swing.JButton();
        btnVehiculo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rSCalendar2 = new rojeru_san.componentes.RSCalendar();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        TxtDescripcion = new javax.swing.JTextField();
        txtTipodeCongestion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte Material");
        setMinimumSize(new java.awt.Dimension(1012, 496));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(56, 65, 82));
        jPanel1.setMinimumSize(new java.awt.Dimension(1012, 496));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("Volver men??");
        btnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 140, 20));

        btnNotificaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNotificaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnNotificaciones.setText("Notificaciones");
        btnNotificaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        btnNotificaciones.setBorderPainted(false);
        btnNotificaciones.setContentAreaFilled(false);
        btnNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, 20));

        BtnMaterial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnMaterial.setForeground(new java.awt.Color(255, 255, 255));
        BtnMaterial.setText("Material");
        BtnMaterial.setBorderPainted(false);
        BtnMaterial.setContentAreaFilled(false);
        jPanel1.add(BtnMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, -1));

        btnVehiculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnVehiculo.setText("Veh??culo");
        btnVehiculo.setBorderPainted(false);
        btnVehiculo.setContentAreaFilled(false);
        jPanel1.add(btnVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 100, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingeniero.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 190));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSCalendar2.setColorBackground(new java.awt.Color(56, 65, 82));
        jPanel2.add(rSCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 360, 330));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GraficaMInerales.PNG"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 430, 240));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(56, 65, 82));
        jLabel5.setText("Fecha:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(56, 65, 82));
        jLabel6.setText("Descripci??n:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(56, 65, 82));
        jLabel7.setText("Ruta:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(56, 65, 82));
        jLabel8.setText("Informaci??n del reporte");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        txtFecha.setBorder(null);
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 260, -1));

        TxtDescripcion.setBorder(null);
        jPanel2.add(TxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 630, 30));

        txtTipodeCongestion.setBorder(null);
        txtTipodeCongestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipodeCongestionActionPerformed(evt);
            }
        });
        jPanel2.add(txtTipodeCongestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, -1));

        jSeparator1.setBackground(new java.awt.Color(56, 65, 82));
        jSeparator1.setForeground(new java.awt.Color(56, 65, 82));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 630, 30));

        jSeparator2.setBackground(new java.awt.Color(56, 65, 82));
        jSeparator2.setForeground(new java.awt.Color(56, 65, 82));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 150, 30));

        jSeparator3.setBackground(new java.awt.Color(56, 65, 82));
        jSeparator3.setForeground(new java.awt.Color(56, 65, 82));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.setVisible(false);
        this.getInstanciaFrmMenu().setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionesActionPerformed
        this.setVisible(false);
         this.getInstanciaFrmNotificaciones().setVisible(true);
    }//GEN-LAST:event_btnNotificacionesActionPerformed

    private void txtTipodeCongestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipodeCongestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipodeCongestionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMaterial;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNotificaciones;
    private javax.swing.JButton btnVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private rojeru_san.componentes.RSCalendar rSCalendar2;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTipodeCongestion;
    // End of variables declaration//GEN-END:variables
}
