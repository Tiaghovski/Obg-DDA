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
public class GestoraJugadores {    
    public ArrayList<Jugador> colJugadores;
    private static GestoraJugadores instanciaGestora = new GestoraJugadores();
    
    public GestoraJugadores()
    {
        colJugadores = new ArrayList<Jugador>();
        CargarJugadoresPorDefecto();
    }
    
    public static GestoraJugadores getInstance()
    {
        return instanciaGestora;
    }
    
    public void CargarJugadoresPorDefecto()
    {
        Jugador j1 = new Jugador();
        j1.nombreUsuario = "jperez";
        j1.password = "123";
        j1.nombre = "Juan Perez";
        j1.saldo = 1000;
        colJugadores.add(j1);
        Jugador j2 = new Jugador();
        j2.nombreUsuario = "ssilva";
        j2.password = "123";
        j2.nombre = "Santiago Silva";
        j2.saldo = 2000;
        colJugadores.add(j2);
        Jugador j3 = new Jugador();
        j3.nombreUsuario = "mazzanga";
        j3.password = "123";
        j3.nombre = "Lucas Mazzarino";
        j3.saldo = 3000;
        colJugadores.add(j3);
    }
    
    public Jugador ObtenerJugadorPorNombreUsuario(String nombreU)
    {
        for(Jugador j : colJugadores)
        {
            if(nombreU.equals(j.getNombreUsuario()))
            {
                return j;
            }
        }
        return null;
    }
    
    public boolean ValidarJugador(String user, String pass)
    {
        Jugador j = ObtenerJugadorPorNombreUsuario(user);
        if(j!= null)
        {
            return j.getPassword().equals(pass);
        }
        return false;
    }
    
 



   
    
  
    
   
}
