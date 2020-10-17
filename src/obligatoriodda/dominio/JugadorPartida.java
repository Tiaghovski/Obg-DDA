/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

import java.awt.AWTEventMulticaster;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class JugadorPartida {
    public Jugador jugador;
    public Partida partida;
    public int puntos;
    public ArrayList<Carta> mano;
    public boolean turno;

    public JugadorPartida(Jugador jugador, Partida partida, int puntos, boolean turno) {
        this.jugador = jugador;
        this.partida = partida;
        this.puntos = puntos;       
        this.turno = turno;
    }

    public JugadorPartida(Jugador j, Partida nuevaPartida) {
        this.jugador = j;
        this.partida = nuevaPartida;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public boolean isTurno() {
        return turno;
    }
    
    public void setTurno(boolean turno){
        this.turno = turno;
    }

    public void TomarCarta(Carta e) {
        partida.getMazo().remove(e);
        mano.add(e);        
    }

   
    
    
    
    
    
}
