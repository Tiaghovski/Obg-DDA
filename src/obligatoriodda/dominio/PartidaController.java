/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class PartidaController implements Observer {

    public UIPartida ui;
    public JugadorPartida jp;

    public PartidaController(UIPartida ui, JugadorPartida jp) {
        this.ui = ui;
        this.jp = jp;
        jp.getPartida().AgregarObserver(this);
    }

    @Override
    public void Update(Observable o, Object evento) {
        if (evento instanceof Evento) {
            if (evento == Evento.PartidaIniciada) {
                ui.PartidaIniciada();
                PartidaIniciada();
            } else if (evento == Evento.JugadorEliminado) {
                ui.setJugadoresEsperando(((Partida) o).getColJugadores().size());
            } else if (evento == Evento.JugadorAgregado) {
                ui.setJugadoresEsperando(((Partida) o).getColJugadores().size());
            }
            else if (evento == Evento.SiguienteTurno)
            {
                ui.MostrarCartasMesa();
                SiguienteTurno();               
            }
        }
    }

    public void PartidaIniciada() {        
        if (jp == jp.getPartida().getColJugadores().get(0)) {
            for (int i = 0; i < jp.getPartida().getColJugadores().size(); i++) {
                jp.getPartida().BarajarMazo();
                ArrayList mano = new ArrayList<>(jp.getPartida().getMazo().subList(0, 7));
                mano.add(Carta.NoTieneCarta());
                jp.getPartida().getColJugadores().get(i).setMano(mano);
                jp.getPartida().getMazo().subList(0, 7).clear();
                jp.setTurno(true);
            }
            ui.MostrarCartas();
            ui.MostrarMazo();
            PrimerTurno();
        }
        ui.MostrarCartas();
        ui.MostrarMazo();
    }

    public Carta[] ObtenerManojo() {
        Carta[] array = jp.getMano().toArray(new Carta[jp.getMano().size()]);
        return array;
    }

    public Carta[] ObtenerMazo() {

        Carta[] array = new Carta[2];
        array[0] = Carta.CartaAtras();
        array[1] = Carta.NoTieneCarta();
        return array;
    }

    public Carta[] ObtenerCartasMesa() {

        Carta[] array = new Carta[2];
        array[0] = Carta.CartaAtras();
        array[1] = jp.getPartida().getCartasMesa().get(jp.getPartida().getCartasMesa().size() - 1);
        return array;
    }

    public void PrimerTurno() {
        if (jp.isTurno()) {
            ui.AvisarTurno();
            jp.getMano().remove(Carta.NoTieneCarta());
            jp.TomarCarta(jp.getPartida().getMazo().get(0));
            ui.DeshabilitarTomarCartas();                       
            ui.MostrarMazo();
            ui.MostrarMensajedeTirar();
        }
    }
    
    public void SiguienteTurno()
    {
        if (jp.isTurno())
        {
            
            ui.AvisarTurno();
            ui.MostrarCartasMesa();
            ui.HabilitarBotonesTomar();
            
        }else{
            ui.DeshabilitarBotonTirar();
        }
    }

    public boolean esTurno() {
        return jp.isTurno();
    }

    public void TirarCarta(Carta c) {
        jp.getMano().set(jp.getMano().indexOf(c), Carta.NoTieneCarta());
//        jp.getMano().add(Carta.NoTieneCarta());
        jp.getPartida().getCartasMesa().add(c);
        ui.MostrarCartasMesa();
        ui.MostrarCartas();
        jp.getPartida().SiguienteTurno(jp);
    }

    public void TomardelMazo() {
        if(jp.getMano().contains(Carta.NoTieneCarta()))
        {
            jp.getMano().remove(Carta.NoTieneCarta());
            jp.TomarCarta(jp.getPartida().getMazo().get(0));
            ui.MostrarCartasMesa();
            ui.MostrarCartas();    
        }             
    }

    public void TomardelaMesa() {
        if(jp.getMano().contains(Carta.NoTieneCarta()))
        {
            jp.getMano().remove(Carta.NoTieneCarta());
            jp.TomarCarta(jp.getPartida().getCartasMesa().get(jp.getPartida().getCartasMesa().size() - 1));
            ui.MostrarCartasMesa();
            ui.MostrarCartas();      
        }    
       
    }
    
    public void Cortar(JugadorPartida jp)
    {
        ArrayList<Carta> mano = jp.getMano();
        if(mano.get(0).getPalo() == Palo.Espada)
        {
            ui.AvisarCorte();   
        }
        
        
//        if(TieneConga())
//        {
//            
//        }
////        else if(CartasIgualesNumero())
////        {
////            
////        }
////        else if(Escalera())
////        {
////            
////        }
    }
    
//    public boolean TieneConga(JugadorPartida jp)
//    {        
//        ArrayList<Carta> mano = jp.getMano();
//        for(int i=0; i <= mano.size(); i++)
//        {
//            
//        }
//    }

}
