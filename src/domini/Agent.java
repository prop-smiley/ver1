package domini;

/**
 *
 * @author alumne
 */
public class Agent {
    //Dades
    private static int idAgent;
    Itinerari it;
    Reunio re;
    
    /*
     * Crea un nou agent a partir del seu id
     */
    public Agent(int nouID){
    	idAgent = nouID;
    }
    
    /*
     * Converteix el nouCami en un objecte pertanyent a Itinerari
     * i fa les assignacions necessaries
     */
    public void realitzaItinerari(Itinerari it){
    	this.it = it;
    }
    
    /*
     * Funció per assignar la nova reunió
     */
    public void assistirReunio(Reunio re){
    	this.re = re;
    }
    
    public String toString(){
    	Integer aux = idAgent;
    	return aux.toString();
    }
    
    public int id(){
    	return idAgent;
    }
    
    public Itinerari it(){
    	return it;
    }
    
    public Reunio re(){
    	return this.re;
    }
    
}
