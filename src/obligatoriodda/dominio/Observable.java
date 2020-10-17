/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatoriodda.dominio;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public abstract class Observable {
    
    public final ArrayList<Observer> colObservers;
    
    public void AgregarObserver(Observer o)
    {
        colObservers.add(o);
    }
    
    public void RemoverObserver(Observer o)
    {
        colObservers.remove(o);
    }
    
    public abstract void notifyObserver(Object obj);
    
    public Observable()
    {
        colObservers = new ArrayList<>();
    }
    
}
