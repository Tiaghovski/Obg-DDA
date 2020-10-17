/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Santiago
 */
public class GestoraCartas {
       private static GestoraCartas instanciaGestora = new GestoraCartas();
       private ArrayList<Carta> cartas;
       private int posSiguienteCarta; //Se usa para no eliminar carta del array, se baraja cambiando posiciones sino cuando hay que barajar hay que crear toda la baraja de nuevo
       public static final int NumCartas = 48; //Cantidad de cartas en el maso

    public GestoraCartas()
    {
        cartas = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            Palo palo = Arrays.asList(Palo.values()).get(i);
            for (int j = 1; j < 13; j++) {
                Carta carta = new Carta(j, palo);
                cartas.add(carta);
            }
        }        
    }
    
    public static GestoraCartas getInstance()
    {
        return instanciaGestora;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }      
    
  
    

    public int cartasDisponibles() { //Retorna cantidad de cartas disponibles
        return NumCartas - posSiguienteCarta;
    }


 
}
