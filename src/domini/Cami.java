package domini;

import java.util.*;


/**
 *
 * @author susanhenriquezelias
 */
public class Cami {
    //Dades
    private final int idCami;
    public List<Tram> llistatTrams = new ArrayList<Tram>();
    
    public Cami(int id){
         this.idCami = id;
    }
    
    /**
     * Accio per afegir tram al cami objecte
     * @param nouT Tram nou que formara par del cami
     */
    public void afegirTram(Tram nouT){
    	llistatTrams.add(nouT); 
    }
    
    /**
     * Accio per eliminar l ultim tram del cami.
     */
    public void eliminarTramFinal(){
        int numElementos = llistatTrams.size();
    	llistatTrams.remove(numElementos - 1);    	
    }
    public void eliminarTram(Tram t){
        llistatTrams.remove(t);
    }
    
    public int getidCami(){
    	return this.idCami;
    }
    /**
     * Funcio get dels trams que formen el cami objecte.
     * @return llista de tots els trams que formen el cami objecte
     */
    public List<Tram> gettrams(){
        return this.llistatTrams;
     }
    
    public boolean teTram(int idcomp){
        boolean res = false;
        Iterator<Tram>iter = llistatTrams.iterator();
        while(iter.hasNext()){
            if(iter.next().id() == idcomp ) res = true;
        }
        return res;
    }
    
    public boolean equals(Cami b){
    	return (this.idCami == b.getidCami());
    }
    
    
    
}