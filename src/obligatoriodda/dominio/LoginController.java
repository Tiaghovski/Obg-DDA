/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

import obligatoriodda.FrmJugador;

/**
 *
 * @author alumno
 */
public class LoginController {
    public UILogin ui;

    public LoginController(UILogin ui) {
        this.ui = ui;
    }
    
    public void IniciarSesion()
    {
        boolean res = GestoraJugadores.getInstance().ValidarJugador(ui.getNombreUsuario(), ui.getPassword());
        Jugador j = GestoraJugadores.getInstance().ObtenerJugadorPorNombreUsuario(ui.getNombreUsuario());
        if(!res)
        {
            ui.MostrarMensaje("Usuario y/o contraseña incorrecto");
        }
        else if (j.estado == true)
        {
            ui.MostrarMensaje("Usuario ya está logeado");    
        }
        else
        {
            new FrmJugador(j).setVisible(true);
            j.setEstado(true);
            ui.MostrarMensaje("");
        }
    }
    
    
}
