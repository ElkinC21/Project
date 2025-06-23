/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import Logica.Cuentas;
import Logica.Usuario;
import javax.swing.*;
import java.awt.*;

public class UniversoMarvel extends javax.swing.JFrame {

    private Cuentas sistemaCuentas;
    private Usuario usuarioActual;
         
    public UniversoMarvel(Cuentas sistema, Usuario usuario) {
        this.sistemaCuentas = sistema;
        this.usuarioActual = usuario;
        initComponents();
        this.setSize(750, 920);
        setTitle("UNIVERSO MARVEL");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public UniversoMarvel() {
        initComponents();
        setTitle("UNIVERSO MARVEL");
        setSize(750, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        batallas = new javax.swing.JButton();
        regresar2 = new javax.swing.JButton();
        ranking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Universo Marvel");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 300, 380, 170);

        batallas.setBackground(new java.awt.Color(102, 102, 0));
        batallas.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        batallas.setForeground(new java.awt.Color(0, 0, 0));
        batallas.setText("Batallas");
        batallas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batallasActionPerformed(evt);
            }
        });
        getContentPane().add(batallas);
        batallas.setBounds(230, 600, 290, 40);

        regresar2.setBackground(new java.awt.Color(102, 102, 0));
        regresar2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        regresar2.setForeground(new java.awt.Color(0, 0, 0));
        regresar2.setText("Regresar");
        regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar2ActionPerformed(evt);
            }
        });
        getContentPane().add(regresar2);
        regresar2.setBounds(230, 670, 290, 40);

        ranking.setBackground(new java.awt.Color(102, 102, 0));
        ranking.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        ranking.setForeground(new java.awt.Color(0, 0, 0));
        ranking.setText("Ranking");
        ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingActionPerformed(evt);
            }
        });
        getContentPane().add(ranking);
        ranking.setBounds(230, 530, 290, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bk3.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingActionPerformed
        new Ranking(sistemaCuentas, usuarioActual).setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_rankingActionPerformed

    private void batallasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batallasActionPerformed
       new Batallas(sistemaCuentas, usuarioActual).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_batallasActionPerformed

    private void regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar2ActionPerformed
        new Juego(sistemaCuentas, usuarioActual).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batallas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton ranking;
    private javax.swing.JButton regresar2;
    // End of variables declaration//GEN-END:variables
}
