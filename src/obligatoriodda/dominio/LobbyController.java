/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;


import obligatoriodda.FrmPartida;

/**
 *
 * @author alumno
 */
public class LobbyController {
    public UIJugador ui;

    public LobbyController(UIJugador ui) {
        this.ui = ui;
    }
    
    public void EntrarLobby()
    {
        Partida nuevaPartida = GestoraPartidas.getInstance().BuscarPartida(ui.getApuesta());
        JugadorPartida jugadorPartida = new JugadorPartida(ui.getJugador(),nuevaPartida);  
        new FrmPartida(jugadorPartida).setVisible(true);
        nuevaPartida.agregarJugador(jugadorPartida);
        ///////////////////////////////////////////////////////
       
      
      
        

        

        
    }

    

    
    
    
}
