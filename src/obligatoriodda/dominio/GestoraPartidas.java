/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class GestoraPartidas {
    private ArrayList<Partida> colPartidas;
    private static GestoraPartidas instanciaGestora = new GestoraPartidas();
    
    private GestoraPartidas()
    {
        colPartidas = new ArrayList<Partida>();
    }
    
    public static GestoraPartidas getInstance()
    {
        return instanciaGestora;
    }    
  
    
    public Partida BuscarPartida(int saldo)
    {
        for(Partida p : colPartidas)
        {
            if(p.getValorApuesta() == saldo)
            {
                return p;
            }            
        }
        Partida nuevaPartida = new Partida(saldo);
        nuevaPartida.setNumeroPartida(1 + colPartidas.size());
        colPartidas.add(nuevaPartida);
        return nuevaPartida;
    }
}
