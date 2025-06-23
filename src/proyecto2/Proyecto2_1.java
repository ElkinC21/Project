/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import Logica.Cuentas;
import javax.swing.JFrame; 
import javax.swing.JOptionPane;
public class Proyecto2_1 extends javax.swing.JFrame {
private Cuentas sistemaCuentas;

    public Proyecto2_1() {
        this.sistemaCuentas = new Cuentas(); 
        initComponents();
        setTitle("MENU PRINCIPAL");
        setSize(750, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
public Proyecto2_1(Cuentas sistema) {
        this.sistemaCuentas = sistema;
        initComponents();
        setTitle("MENU PRINCIPAL");
        setSize(750, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        Crearcuenta = new javax.swing.JButton();
        Iniciosesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Salir.setBackground(new java.awt.Color(153, 153, 153));
        Salir.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.setActionCommand("");
        Salir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(280, 480, 210, 50);

        Crearcuenta.setBackground(new java.awt.Color(153, 153, 153));
        Crearcuenta.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        Crearcuenta.setForeground(new java.awt.Color(255, 255, 255));
        Crearcuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-registro-24.png"))); // NOI18N
        Crearcuenta.setText("Crear cueenta");
        Crearcuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Crearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearcuentaActionPerformed(evt);
            }
        });
        getContentPane().add(Crearcuenta);
        Crearcuenta.setBounds(280, 390, 210, 50);

        Iniciosesion.setBackground(new java.awt.Color(153, 153, 153));
        Iniciosesion.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        Iniciosesion.setForeground(new java.awt.Color(255, 255, 255));
        Iniciosesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-registro-24.png"))); // NOI18N
        Iniciosesion.setText("Inicio sesion");
        Iniciosesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Iniciosesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciosesionActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciosesion);
        Iniciosesion.setBounds(280, 290, 210, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stra.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-130, -30, 880, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearcuentaActionPerformed
new Crearcuenta(sistemaCuentas).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_CrearcuentaActionPerformed

    private void IniciosesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciosesionActionPerformed
        new Registro(sistemaCuentas).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_IniciosesionActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Proyecto2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto2_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto2_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crearcuenta;
    private javax.swing.JButton Iniciosesion;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
