/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

/**
 *
 * @author alumno
 */
public interface UIJugador {
        
    String getNombreUsuario();
    
    String getPassword();    
    
    int getApuesta();
    
    Jugador getJugador();
}
