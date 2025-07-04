/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import Logica.Cuentas;
import Logica.Usuario;
import javax.swing.JFrame;

public class historialPartidas extends javax.swing.JFrame {

    private Cuentas sistemaCuentas;
    private Usuario usuarioActual;

    public historialPartidas(Cuentas sistema, Usuario usuario) {
        this.sistemaCuentas = sistema;
        this.usuarioActual = usuario;  
        initComponents();
        setSize(750,920);
        this.setLocationRelativeTo(null);
        tituloHistorial.setText("Historial de Partidas de " + usuario.getUsuario());
        displayGameLogs();
    }
    
    public historialPartidas() {
        initComponents();
    }
    
    private void displayGameLogs() {
        if (usuarioActual != null && usuarioActual.getIngresos() != null) {
            StringBuilder sb = new StringBuilder();
            if (usuarioActual.getnumIngresos() == 0) {
                sb.append("No hay partidas registradas.");
            } else {
                sb.append("--- TUS ULTIMAS PARTIDAS ---\n\n");
                for (int i = 0; i < usuarioActual.getnumIngresos(); i++) {
                    sb.append((i + 1)).append(". ");
                    sb.append(usuarioActual.getIngresos()[i].toString()).append("\n\n");
                }
            }
            jTextArea1.setText(sb.toString());
            jTextArea1.setEditable(false);
            jTextArea1.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
        }
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
        regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tituloHistorial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Historial de Partidas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 70, 380, 170);

        regresar.setBackground(new java.awt.Color(102, 102, 0));
        regresar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        regresar.setForeground(new java.awt.Color(0, 0, 0));
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar);
        regresar.setBounds(240, 760, 290, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 290, 470, 440);

        tituloHistorial.setBackground(new java.awt.Color(102, 102, 0));
        tituloHistorial.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        tituloHistorial.setForeground(new java.awt.Color(0, 0, 0));
        tituloHistorial.setText("Villanos");
        tituloHistorial.setOpaque(true);
        getContentPane().add(tituloHistorial);
        tituloHistorial.setBounds(230, 250, 300, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bk4.jpg"))); // NOI18N
        jLabel2.setText("Eliminar Cuenta");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        new MiPerfilMenu(sistemaCuentas, usuarioActual).setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel tituloHistorial;
    // End of variables declaration//GEN-END:variables
}
