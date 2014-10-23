package smiley;

import java.util.*;


/**
 *
 * @author alumne
 */
public class Cami {
    //Dades
    public List<Tram> llistatTrams = new ArrayList<Tram>();
    public Tram lastTram;
    
    public Cami(){
    	
    
    }
    
    public void afegirTram(Tram nouT){
    	llistatTrams.add(nouT); 
    	lastTram = nouT;
    }
    
    public void eliminarTram(){
    	llistatTrams.remove(llistatTrams.lastIndexOf(lastTram));    	
    }
    
    public String llista(){
    	return "falta editar"; 
    }
    
    
}
