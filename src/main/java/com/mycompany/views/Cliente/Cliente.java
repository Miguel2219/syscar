/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views.Cliente;

/**
 *
 * @author USUARIO
 */
public class Cliente extends javax.swing.JPanel {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
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
        menuCliente = new javax.swing.JPanel();
        menuClienteTxt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        formularioContacto = new javax.swing.JButton();
        solicitarServicios = new javax.swing.JButton();
        listadoServiciosDisponibles = new javax.swing.JButton();
        historialSolicitudes = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        menuClienteTxt.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        menuClienteTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuClienteTxt.setText("MENU");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        formularioContacto.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        formularioContacto.setText("Formulario de contacto");
        formularioContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioContactoActionPerformed(evt);
            }
        });

        solicitarServicios.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        solicitarServicios.setText("SOLICITAR SERVICIOS");
        solicitarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarServiciosActionPerformed(evt);
            }
        });

        listadoServiciosDisponibles.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        listadoServiciosDisponibles.setText("listado de servicios disponibles");
        listadoServiciosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoServiciosDisponiblesActionPerformed(evt);
            }
        });

        historialSolicitudes.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        historialSolicitudes.setText("historial de solicitudes");
        historialSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialSolicitudesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuClienteLayout = new javax.swing.GroupLayout(menuCliente);
        menuCliente.setLayout(menuClienteLayout);
        menuClienteLayout.setHorizontalGroup(
            menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuClienteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuClienteLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listadoServiciosDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(formularioContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historialSolicitudes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(solicitarServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        menuClienteLayout.setVerticalGroup(
            menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuClienteLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(menuClienteTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(listadoServiciosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historialSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formularioContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(menuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuClienteLayout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(solicitarServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(428, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 729, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void historialSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialSolicitudesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historialSolicitudesActionPerformed

    private void listadoServiciosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoServiciosDisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listadoServiciosDisponiblesActionPerformed

    private void solicitarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solicitarServiciosActionPerformed

    private void formularioContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formularioContactoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton formularioContacto;
    private javax.swing.JButton historialSolicitudes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton listadoServiciosDisponibles;
    private javax.swing.JPanel menuCliente;
    private javax.swing.JLabel menuClienteTxt;
    private javax.swing.JButton solicitarServicios;
    // End of variables declaration//GEN-END:variables
}
