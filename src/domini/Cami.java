package domini;

import java.util.*;


/**
 *
<<<<<<< HEAD
 * @author alumne
=======
 * @author susanhenriquezelias
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
 */
public class Cami {
    //Dades
    private final int idCami;
    public List<Tram> llistatTrams = new ArrayList<Tram>();
    
<<<<<<< HEAD
    /**
     * Accio per afegir tram al cami objecte
     * @param nout Tram nou que formara par del cami
=======
    public Cami(int id){
         this.idCami = id;
    }
    
    /**
     * Accio per afegir tram al cami objecte
     * @param nouT Tram nou que formara par del cami
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
     */
    public void afegirTram(Tram nouT){
    	llistatTrams.add(nouT); 
    }
    
    /**
     * Accio per eliminar l ultim tram del cami.
     */
<<<<<<< HEAD
    public void eliminarTram(){
    	llistatTrams.remove(llistatTrams.lastIndexOf(lastTram));    	
    }
    
=======
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
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
    /**
     * Funcio get dels trams que formen el cami objecte.
     * @return llista de tots els trams que formen el cami objecte
     */
<<<<<<< HEAD
    public String llista(){
    	return "falta editar"; 
=======
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
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
    }
    
    public boolean equals(Cami b){
    	return (this.idCami == b.getidCami());
    }
    
    
    
<<<<<<< HEAD
    
    
}
=======
}
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
