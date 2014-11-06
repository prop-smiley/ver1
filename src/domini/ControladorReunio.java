/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domini;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author susanhenriquezelias
 */
public class ControladorReunio {
    public List<Reunio> llistatReunions = new ArrayList<Reunio>();
    
    public ControladorReunio(){
        
    }
    
    public boolean exists(Reunio re){
        return llistatReunions.contains(re);
    }
    
    
    public Reunio getReunio(Date data, Ciutat desti){
        Iterator<Reunio>iter = llistatReunions.iterator();
        while(iter.hasNext()){
            //if(/**/) falta poner la comparacion
                return iter.next();
        }
        System.out.println("No existe la reunioblablabla");
        return null;
    } 
    
    public void newReunio(Ciutat desti, Date data){
  	   	Reunio re =  new Reunio(desti,data);
        if(exists(re) == false){
     	   this.llistatReunions.add(re);
        }
        else System.out.println("La reunio ja existeix");
    }
    
    
    
}