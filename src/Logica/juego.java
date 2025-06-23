/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nathan
 */
public class juego {
    private String winnerUsername;
    private String winnerFaction;
    private String loserUsername;
    private String loserFaction;
    private String gameEventType;
    private int puntuacionObtenida;
    private LocalDateTime fechaHora;
    private String resultado; 


    public juego(String winnerUsername, String winnerFaction, String loserUsername, String loserFaction, String gameEventType, int puntuacionObtenida) {
        this.winnerUsername = winnerUsername;
        this.winnerFaction = winnerFaction;
        this.loserUsername = loserUsername;
        this.loserFaction = loserFaction;
        this.gameEventType = gameEventType;
        this.puntuacionObtenida = puntuacionObtenida;
        this.fechaHora = LocalDateTime.now();
    }
    
    public juego(String resultadoDescripcion, int puntuacionObtenida) {
        this.resultado = resultadoDescripcion;
        this.puntuacionObtenida = puntuacionObtenida;
        this.fechaHora = LocalDateTime.now();
        this.gameEventType = "GENERIC_GAME_END"; 
    }
    
    
    public String getWinnerUsername() { return winnerUsername; }
    public String getWinnerFaction() { return winnerFaction; } 
    public String getLoserUsername() { return loserUsername; }
    public String getLoserFaction() { return loserFaction; }
    public String getGameEventType() { return gameEventType; }
    
    public String getResultado() {
        return resultado;
    }

    public int getPuntuacionObtenida() {
        return puntuacionObtenida;
    }
    
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHora.format(formatoFecha);

        switch (gameEventType) {
            case "EARTH_CAPTURE":
                return String.format("%s usando los %s ha SALVADO/CAPTURADO la TIERRA! Venciendo a %s - %s",
                        winnerUsername, winnerFaction, loserUsername, fechaFormateada);
            case "NO_MOVES":
                return String.format("%s usando %s ha perdido por no tener movimientos validos disponibles ante %s - %s",
                        loserUsername, loserFaction, winnerUsername, fechaFormateada);
            case "RETREAT":
                return String.format("%s usando %s ha ganado ya que %s usando %s se ha retirado del juego - %s",
                        winnerUsername, winnerFaction, loserUsername, loserFaction, fechaFormateada);
            case "ALL_PIECES_DESTROYED":
                return String.format("%s usando los %s ha ganado (todas las piezas destruidas) ante %s - %s",
                        winnerUsername, winnerFaction, loserUsername, fechaFormateada);
            default:
                return String.format("[%s] Partida Terminada - Puntos: %d", fechaFormateada, puntuacionObtenida);
        }
    }
}

