/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import Logica.Cuentas;
import Logica.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathan
 */
public class Crearcuenta extends javax.swing.JFrame {
    private Cuentas sistemaCuentas;

    public Crearcuenta() {
        initComponents();
        setSize(750,920);
        setLayout(null);
        setLocationRelativeTo(this);
        this.sistemaCuentas = new Cuentas();
         
    }
    public Crearcuenta(Cuentas sistema) {
        initComponents();
        setSize(750, 800);
        setLayout(null);
        setLocationRelativeTo(this);
        this.sistemaCuentas = sistema; 
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelu = new javax.swing.JLabel();
        labelcontra = new javax.swing.JLabel();
        registraru = new javax.swing.JTextField();
        registrarc = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        confcontra = new javax.swing.JLabel();
        textconf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Cuenta");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 170, 380, 170);

        labelu.setBackground(new java.awt.Color(102, 102, 0));
        labelu.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelu.setForeground(new java.awt.Color(0, 0, 0));
        labelu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-maravilla-48.png"))); // NOI18N
        labelu.setText("Usuario:");
        labelu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        labelu.setOpaque(true);
        getContentPane().add(labelu);
        labelu.setBounds(100, 300, 260, 50);

        labelcontra.setBackground(new java.awt.Color(102, 102, 0));
        labelcontra.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelcontra.setForeground(new java.awt.Color(0, 0, 0));
        labelcontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-maravilla-48.png"))); // NOI18N
        labelcontra.setText("Contraseña:");
        labelcontra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        labelcontra.setOpaque(true);
        getContentPane().add(labelcontra);
        labelcontra.setBounds(100, 380, 260, 50);

        registraru.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                registraruComponentAdded(evt);
            }
        });
        registraru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraruActionPerformed(evt);
            }
        });
        getContentPane().add(registraru);
        registraru.setBounds(390, 300, 270, 50);

        registrarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarcActionPerformed(evt);
            }
        });
        getContentPane().add(registrarc);
        registrarc.setBounds(390, 380, 270, 50);

        registrar.setBackground(new java.awt.Color(102, 102, 0));
        registrar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 0));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-registro-24.png"))); // NOI18N
        registrar.setText("Registrarse");
        registrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar);
        registrar.setBounds(260, 590, 210, 50);

        confcontra.setBackground(new java.awt.Color(102, 102, 0));
        confcontra.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        confcontra.setForeground(new java.awt.Color(0, 0, 0));
        confcontra.setText("Confirmar Contraseña:");
        confcontra.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        confcontra.setOpaque(true);
        getContentPane().add(confcontra);
        confcontra.setBounds(100, 450, 260, 50);

        textconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textconfActionPerformed(evt);
            }
        });
        getContentPane().add(textconf);
        textconf.setBounds(390, 450, 270, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bk2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 750, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registraruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraruActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_registraruActionPerformed

    private void registrarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarcActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_registrarcActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        
        String usuario = registraru.getText();
        String contra = registrarc.getText();
        String confContra = textconf.getText();
        
        if (usuario == null || usuario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "El campo Usuario no puede estar vacío.", 
                "Campo Requerido", 
                JOptionPane.WARNING_MESSAGE);
            registraru.requestFocus();
            return;
        }
        
        if (contra == null || contra.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "El campo Contraseña no puede estar vacío.", 
                "Campo Requerido", 
                JOptionPane.WARNING_MESSAGE);
            registrarc.requestFocus();
            return;
        }
        
        if (confContra == null || confContra.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "El campo Confirmar Contraseña no puede estar vacío.", 
                "Campo Requerido", 
                JOptionPane.WARNING_MESSAGE);
            textconf.requestFocus();
            return;
        }
        
        usuario = usuario.trim();
        contra = contra.trim();
        confContra = confContra.trim();
        
        
        if (!contra.equals(confContra)) {
            JOptionPane.showMessageDialog(this, 
                "Las contraseñas no coinciden.\nPor favor, verifica e inténtalo de nuevo.", 
                "Contraseñas Diferentes", 
                JOptionPane.WARNING_MESSAGE);
            registrarc.setText("");
            textconf.setText("");
            registrarc.requestFocus();
            return;
        }
        
        if (contra.length() != 5) {
            JOptionPane.showMessageDialog(this, 
                "La contraseña debe tener exactamente 5 caracteres.\n" +
                "Longitud actual: " + contra.length() + " caracteres.", 
                "Longitud Inválida", 
                JOptionPane.WARNING_MESSAGE);
            registrarc.setText("");
            textconf.setText("");
            registrarc.requestFocus();
            return;
        }
        
        if (sistemaCuentas == null) {
            sistemaCuentas = new Cuentas(); 
        }
        
        boolean registroExitoso = sistemaCuentas.registrarUsuario(usuario, contra);
        
        if (registroExitoso) {
            JOptionPane.showMessageDialog(this, 
                "¡Usuario '" + usuario + "' registrado exitosamente!\n" +
                "Ya puedes iniciar sesión con tus credenciales.", 
                "Registro Exitoso", 
                JOptionPane.INFORMATION_MESSAGE);
            
            registraru.setText("");
            registrarc.setText("");
            textconf.setText("");
            
            new Proyecto2_1(sistemaCuentas).setVisible(true);
            this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(this, 
                "No se pudo registrar el usuario '" + usuario + "'.\n" +
                "Posibles causas:\n" +
                "• El usuario ya existe\n" +
                "• Error interno del sistema\n\n" +
                "Por favor, intenta con un nombre de usuario diferente.", 
                "Error de Registro", 
                JOptionPane.ERROR_MESSAGE);
            
            registraru.setText("");
            registraru.requestFocus();
        }
        
    }//GEN-LAST:event_registrarActionPerformed

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_registrarMouseClicked

    private void registraruComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_registraruComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_registraruComponentAdded

    private void textconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textconfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textconfActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        new Proyecto2_1(sistemaCuentas).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confcontra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelcontra;
    private javax.swing.JLabel labelu;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField registrarc;
    private javax.swing.JTextField registraru;
    private javax.swing.JTextField textconf;
    // End of variables declaration//GEN-END:variables

    private void setText(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
