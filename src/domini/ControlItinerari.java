/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domini;

import java.util.*;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ERIC
 */
public class ControlItinerari {
    
    public List<Itinerari> ctrlItinerari = new ArrayList<Itinerari>();
    //Constructora
    public ControlItinerari() {}
    
    public void afegirItinerari(Cami c) {
        ctrlItinerari.add((Itinerari)c);
    }
    
    public boolean existeixItinerari(Itinerari it){
       return ctrlItinerari.contains(it);
    }
    
    public void modificarItinerari() {}
    
    public void llistarItinerari() {}
}




    /*
    
    comprobar si existe itinerari a partir de ID
    public boolean existeixItinerari(int ID){
        boolean existeix = false;
        Iterator<Itinerari>iter = ctrlItinerari.iterator();
        while(iter.hasNext()){
            if(iter.next().getidCami() == ID ) existeix = true;
        }
        return existeix;
    }
    */
  /*  
    
    borrar itinerari a partir de ID
    
    public void borrarItinerari(int ID) {
        if(existeixItinerari(ID)== true){
            boolean b = false;
            Iterator<Itinerari>iter = ctrlItinerari.iterator();
            while(iter.hasNext()){
            if(iter.next().getidCami() == ID && !b ) {
               b = true;
               int aux = ctrlItinerari.indexOf(iter.next());
               ctrlItinerari.remove(aux);
            }
        }
    } */
        