/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Santiago
 */
public class Partida extends Observable {

    public ArrayList<JugadorPartida> colJugadores;
    public ArrayList<Carta> Mazo;
    public ArrayList<Carta> CartasMesa;
    public int maximoJugadores = 3;
    public int valorApuesta;
    public boolean iniciada = false;
    public int puntos;
    public int numeroPartida;
    public int pozo;
    public int siguienteNumero = 0;
    

    public Partida(ArrayList<JugadorPartida> colJugadores, ArrayList<Carta> Mazo, ArrayList<Carta> CartasMesa, int valorApuesta, boolean iniciada, int puntos, int numeroPartida, int pozo, int maximoJugadores) {
        this.colJugadores = colJugadores;
        this.Mazo = Mazo;
        this.CartasMesa = CartasMesa;
        this.valorApuesta = valorApuesta;
        this.iniciada = iniciada;
        this.puntos = puntos;
        this.numeroPartida = siguienteNumero++;
        this.pozo = pozo;
        this.maximoJugadores = maximoJugadores;
    }

    public Partida() {
        colJugadores = new ArrayList<JugadorPartida>();
        Mazo = GestoraCartas.getInstance().getCartas();
        CartasMesa = new ArrayList<Carta>();
    }

    public Partida(int saldo) {
        this.valorApuesta = saldo;
        colJugadores = new ArrayList<JugadorPartida>();
        Mazo = GestoraCartas.getInstance().getCartas();
        CartasMesa = new ArrayList<Carta>();
    }

    public ArrayList<JugadorPartida> getColJugadores() {
        return colJugadores;
    }

    public ArrayList<Carta> getMazo() {
        return Mazo;
    }

    public ArrayList<Carta> getCartasMesa() {
        return CartasMesa;
    }
    
    public void setCartasMesa(ArrayList<Carta> CartasMesa) {
        this.CartasMesa = CartasMesa;
    }   
    
    public void BarajarMazo(){
        Collections.shuffle(Mazo);
    }

    public void setColJugadores(ArrayList<JugadorPartida> colJugadores) {
        this.colJugadores = colJugadores;
    }

    public void setMazo(ArrayList<Carta> Mazo) {
        this.Mazo = Mazo;
    }

    public int getValorApuesta() {
        return valorApuesta;
    }

    public void setValorApuesta(int valorApuesta) {
        this.valorApuesta = valorApuesta;
    }

    public boolean isIniciada() {
        return iniciada;
    }

    public void setIniciada(boolean iniciada) {
        this.iniciada = iniciada;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getNumeroPartida() {
        return numeroPartida;
    }

    public void setNumeroPartida(int numero) {
        this.numeroPartida = numero;
    }

    public int getPozo() {
        return pozo;
    }

    public void setPozo(int pozo) {
        this.pozo = pozo;
    }

    public int getMaximoJugadores() {
        return maximoJugadores;
    }

    public void setMaximoJugadores(int maximoJugadores) {
        this.maximoJugadores = maximoJugadores;
    }

    @Override
    public void notifyObserver(Object obj) {
        for (Observer o : colObservers) {
            o.Update(this, obj);
        }
    }

    public void agregarJugador(JugadorPartida jugadorPartida) {
        colJugadores.add(jugadorPartida);
        if (colJugadores.size() == this.getMaximoJugadores()) {
            notifyObserver(Evento.PartidaIniciada);
        } else {
            notifyObserver(Evento.JugadorAgregado);

        }
    }

    public void eliminarJugador(JugadorPartida jugadorParida) {
        colJugadores.remove(jugadorParida);
        notifyObserver(Evento.JugadorEliminado);
    }

    public void IniciarPartida() {
        setIniciada(true);
    }
    
    public void SiguienteTurno(JugadorPartida jp)
    {
        int index = colJugadores.indexOf(jp);        
        jp.setTurno(false);
        if(index == maximoJugadores -1)
        {
            colJugadores.get(0).setTurno(true);
        }
        else
        {
            colJugadores.get(index + 1).setTurno(true);
        }
        notifyObserver(Evento.SiguienteTurno);
    }
    
   

}
