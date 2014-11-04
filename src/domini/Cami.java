package domini;

import java.util.*;


/**
 *
 * @author alumne
 */
public class Cami {
    //Dades
    public List<Tram> llistatTrams = new ArrayList<Tram>();
    public Tram lastTram;
    
    /**
     * Accio per afegir tram al cami objecte
     * @param nout Tram nou que formara par del cami
     */
    public void afegirTram(Tram nouT){
    	llistatTrams.add(nouT); 
    	lastTram = nouT;
    }
    
    /**
     * Accio per eliminar l ultim tram del cami.
     */
    public void eliminarTram(){
    	llistatTrams.remove(llistatTrams.lastIndexOf(lastTram));    	
    }
    
    /**
     * Funcio get dels trams que formen el cami objecte.
     * @return llista de tots els trams que formen el cami objecte
     */
    public String llista(){
    	return "falta editar"; 
    }
    
    
    
    
}
