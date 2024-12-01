/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemadeflota;

import java.awt.EventQueue;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    int xMouse, yMouse;
    public Login() {
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

        backgroundMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        nombreEmpresa = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        iniciarSesion = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        usuario = new javax.swing.JLabel();
        ingresoUsuario = new javax.swing.JTextField();
        separator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        panelEntrar = new javax.swing.JPanel();
        textEntrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backgroundMain.setBackground(new java.awt.Color(255, 255, 255));
        backgroundMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backgroundMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMainMousePressed(evt);
            }
        });
        backgroundMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(217, 218, 220));

        jLabel1.setBackground(new java.awt.Color(217, 218, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        backgroundMain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 50, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Sin_títulos-removebg-preview.png"))); // NOI18N
        backgroundMain.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 360, 120));

        nombreEmpresa.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        nombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa.setText("Syscar");
        backgroundMain.add(nombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 360, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/background.jpg"))); // NOI18N
        background.setText("jLabel1");
        backgroundMain.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 360, 640));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        backgroundMain.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 50));

        iniciarSesion.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        iniciarSesion.setText("INICIAR SESION");
        backgroundMain.add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 200, -1));

        contraseña.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        contraseña.setText("Contraseña");
        backgroundMain.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        separador2.setBackground(new java.awt.Color(204, 204, 204));
        separador2.setForeground(new java.awt.Color(0, 0, 0));
        backgroundMain.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 360, 20));

        usuario.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        usuario.setText("Usuario");
        backgroundMain.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        ingresoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        ingresoUsuario.setText("Ingrese su usuario");
        ingresoUsuario.setBorder(null);
        ingresoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoUsuarioActionPerformed(evt);
            }
        });
        backgroundMain.add(ingresoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 350, 30));

        separator1.setBackground(new java.awt.Color(204, 204, 204));
        separator1.setForeground(new java.awt.Color(0, 0, 0));
        backgroundMain.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 360, 20));

        jPasswordField1.setFont(new java.awt.Font("Rage Italic", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        backgroundMain.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 370, 30));

        panelEntrar.setBackground(new java.awt.Color(153, 153, 153));
        panelEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        textEntrar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        textEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEntrar.setText("ENTRAR");
        textEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelEntrarLayout = new javax.swing.GroupLayout(panelEntrar);
        panelEntrar.setLayout(panelEntrarLayout);
        panelEntrarLayout.setHorizontalGroup(
            panelEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelEntrarLayout.setVerticalGroup(
            panelEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        backgroundMain.add(panelEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoUsuarioActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void backgroundMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMainMousePressed
        xMouse=evt.getX();     
        yMouse=evt.getY();
    }//GEN-LAST:event_backgroundMainMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        this.setLocation(xMouse,yMouse);
    }//GEN-LAST:event_headerMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
      try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        SwingUtilities.invokeLater(() -> {
            new Login().setVisible(true);
        });
       } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        e.printStackTrace();
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel backgroundMain;
    private javax.swing.JLabel contraseña;
    private javax.swing.JPanel header;
    private javax.swing.JTextField ingresoUsuario;
    private javax.swing.JLabel iniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombreEmpresa;
    private javax.swing.JPanel panelEntrar;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separator1;
    private javax.swing.JLabel textEntrar;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
