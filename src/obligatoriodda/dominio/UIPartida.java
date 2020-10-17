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
public interface UIPartida {
    
    void setJugadoresEsperando(int i);
    
    void PartidaIniciada();

    void MostrarCartas();

    void MostrarMazo();
    
    void AvisarTurno();
    
    Carta ObtenerCartaSeleccionada(Carta c);

    void MostrarCartasMesa();

    void DeshabilitarBotonTirar();
    
    void DeshabilitarTomarCartas();

    void HabilitarBotonesTomar();
    
    void AvisarCorte();

    void MostrarMensajedeTirar();

  
    
 
    
}
