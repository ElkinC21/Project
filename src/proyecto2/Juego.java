/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import Logica.Cuentas;
import Logica.Usuario;
import Logica.juego;
import javax.swing.JOptionPane;
import project.ProyectoStratego; 
/**
 *
 * @author Nathan
 */
public class Juego extends javax.swing.JFrame {
    
    private Cuentas sistemaCuentas;
    private Usuario usuarioActual;
private Usuario opponentUser;

    public Juego() {
        initComponents();
        setSize(750,920);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
    }
    
    public Juego(Cuentas sistema, Usuario usuario) {
        
       this.sistemaCuentas = sistema;
        this.usuarioActual = usuario;
        initComponents();
        setSize(750, 800);
        setLocationRelativeTo(null);
        setTitle("HEROES STRATEGO - " + usuario.getUsuario());
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
         public void partidaTerminada(Logica.juego registroPartida, int puntuacionFinal) { // Changed method name
    if (usuarioActual != null) {
        usuarioActual.registrojuegos(registroPartida);
        usuarioActual.setPuntaje(usuarioActual.getPuntaje() + puntuacionFinal);

        Cuentas.incrementTotalPartidasJugadas();
        if (registroPartida.getWinnerFaction() != null && registroPartida.getWinnerFaction().equals("Heroes")) { // Added null check
            Cuentas.incrementTotalVictoriasHeroes();
        } else if (registroPartida.getWinnerFaction() != null && registroPartida.getWinnerFaction().equals("Villanos")) { // Added null check
            Cuentas.incrementTotalVictoriasVillanos();
        }

        this.setVisible(true);
        JOptionPane.showMessageDialog(this, "Partida terminada: \n" + registroPartida.toString());
    } else {
        System.err.println("Error: usuarioActual es null al terminar la partida.");
        this.setVisible(true);
    }
}
        
        public Usuario getOpponentUser() {
        return opponentUser;
    }
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Partida = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        cerrarsesion = new javax.swing.JButton();
        configurar = new javax.swing.JButton();
        universom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(102, 102, 0));
        jLabel2.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu Principal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 200, 380, 170);

        Partida.setBackground(new java.awt.Color(102, 102, 0));
        Partida.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        Partida.setForeground(new java.awt.Color(0, 0, 0));
        Partida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-control-48.png"))); // NOI18N
        Partida.setText("Partida Nueva");
        Partida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Partida.setOpaque(true);
        Partida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartidaActionPerformed(evt);
            }
        });
        getContentPane().add(Partida);
        Partida.setBounds(280, 360, 240, 70);

        perfil.setBackground(new java.awt.Color(102, 102, 0));
        perfil.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        perfil.setForeground(new java.awt.Color(0, 0, 0));
        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usuario-masculino-en-círculo-48.png"))); // NOI18N
        perfil.setText("Mi Perfil");
        perfil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        getContentPane().add(perfil);
        perfil.setBounds(280, 520, 240, 70);

        cerrarsesion.setBackground(new java.awt.Color(102, 102, 0));
        cerrarsesion.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        cerrarsesion.setForeground(new java.awt.Color(0, 0, 0));
        cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-32.png"))); // NOI18N
        cerrarsesion.setText("Cerrar Sesión");
        cerrarsesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarsesion);
        cerrarsesion.setBounds(280, 680, 240, 70);

        configurar.setBackground(new java.awt.Color(102, 102, 0));
        configurar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        configurar.setForeground(new java.awt.Color(0, 0, 0));
        configurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-ajustes-48.png"))); // NOI18N
        configurar.setText("Configuración");
        configurar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        configurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurarActionPerformed(evt);
            }
        });
        getContentPane().add(configurar);
        configurar.setBounds(280, 440, 240, 70);

        universom.setBackground(new java.awt.Color(102, 102, 0));
        universom.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        universom.setForeground(new java.awt.Color(0, 0, 0));
        universom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-maravilla-48.png"))); // NOI18N
        universom.setText("Universo Marvel");
        universom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        universom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universomActionPerformed(evt);
            }
        });
        getContentPane().add(universom);
        universom.setBounds(280, 600, 240, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bk3.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        new MiPerfilMenu(sistemaCuentas, usuarioActual).setVisible(true);
        dispose();
    }//GEN-LAST:event_perfilActionPerformed

    private void cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Está seguro que desea cerrar sesión?",
            "Confirmar Cierre de Sesión",
            JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, 
                "¡Hasta luego, " + usuarioActual.getUsuario() + "!", 
                "Sesión Cerrada", JOptionPane.INFORMATION_MESSAGE);
            new Proyecto2_1(sistemaCuentas).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_cerrarsesionActionPerformed

    private void PartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartidaActionPerformed

        
        if (sistemaCuentas.getNumUsuarios() <= 1) {
            JOptionPane.showMessageDialog(this, 
                "No hay suficientes jugadores registrados para iniciar una partida.\n" +
                "Por favor, crea otra cuenta.", 
                "Jugadores Insuficientes", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Usuario[] allUsers = sistemaCuentas.getUsuarios();
        java.util.List<String> availableOpponentUsernames = new java.util.ArrayList<>();
        for (int i = 0; i < sistemaCuentas.getNumUsuarios(); i++) {
            if (!allUsers[i].getUsuario().equals(usuarioActual.getUsuario())) {
                availableOpponentUsernames.add(allUsers[i].getUsuario());
            }
        }

        if (availableOpponentUsernames.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "No hay oponentes disponibles en el sistema. Crea otro usuario.",
                "No hay Oponentes", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String selectedOpponentUsername = (String) JOptionPane.showInputDialog(
            this,
            "Selecciona un contrincante:",
            "Seleccionar Oponente",
            JOptionPane.QUESTION_MESSAGE,
            null,
            availableOpponentUsernames.toArray(),
            availableOpponentUsernames.get(0)
        );

        if (selectedOpponentUsername != null) {
            this.opponentUser = sistemaCuentas.buscarUsuario(selectedOpponentUsername);
            
            String[] facciones = {"Heroes", "Villanos"}; 
            int seleccionFaccion = JOptionPane.showOptionDialog( 
                this,
                "Selecciona tu bando:",
                "Elegir Bando",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, 
                facciones, 
                facciones[0] 
            );

            String faccionElegida = null; // 
            if (seleccionFaccion != JOptionPane.CLOSED_OPTION) { 
                faccionElegida = facciones[seleccionFaccion];
            }

            if (faccionElegida != null) { 
        ProyectoStratego game = new ProyectoStratego(this, sistemaCuentas, usuarioActual, faccionElegida);
        game.setVisible(true);
        this.setVisible(false); 
    } else {
                JOptionPane.showMessageDialog(this, "Seleccion de bando cancelada.", "Partida Cancelada", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccion de oponente cancelada.", "Partida Cancelada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_PartidaActionPerformed

    private void configurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configurarActionPerformed
        String[] modos = {"Classic", "Tutorial"}; 
        String modoSeleccionado = (String) JOptionPane.showInputDialog( 
            this,
            "Selecciona el modo de juego:",
            "Configuracion",
            JOptionPane.QUESTION_MESSAGE,
            null,
            modos,
            Cuentas.gameMode
        );

        if (modoSeleccionado != null) {
            Cuentas.gameMode = modoSeleccionado;
            JOptionPane.showMessageDialog(this, 
                "Modo de juego cambiado a: " + modoSeleccionado, 
                "Configuracion Guardada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_configurarActionPerformed

    private void universomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universomActionPerformed
        new UniversoMarvel(sistemaCuentas, usuarioActual).setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_universomActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Partida;
    private javax.swing.JButton cerrarsesion;
    private javax.swing.JButton configurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton perfil;
    private javax.swing.JButton universom;
    // End of variables declaration//GEN-END:variables
}
