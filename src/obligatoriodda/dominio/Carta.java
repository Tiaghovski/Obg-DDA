/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

/**
 *
 * @author Santiago
 */
public class Carta {    
    public int numero;
    public Palo palo;  
//    public static final int LimiteCartaPalo = 12;//Cant cartas cada palo;
    public boolean seleccionada = false;
    private static final Carta NoCarta = new Carta(0, Palo.Ninguno);
    private static final Carta CartaAtras = new Carta(0, Palo.Atras);

    public Carta(int numero, Palo palo) {
       this.numero = numero;    
       this.palo = palo;
    }      

    public boolean isSeleccionada() {
        return seleccionada;
    }

    public void setSeleccionada(boolean seleccionada) {
        this.seleccionada = seleccionada;
    }

    @Override
    public String toString() {
        return palo.toString().toLowerCase() + numero + ".jpg";
    }
    
    public static Carta CartaAtras(){
        return CartaAtras;
    }
    
    public static Carta NoTieneCarta() {
        return NoCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
    
    
    
}
