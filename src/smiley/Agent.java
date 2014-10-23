package smiley;

/**
 *
 * @author alumne
 */
public class Agent {
    //Dades
    private static int idAgent;
    Itinerari it;
    Reunio re;
    
    public Agent(int nouID){
    	idAgent = nouID;
    }
    
    public static void realitzaItinerari(Cami nouCami){
    	/*
    	 * crea itinerari < subclase de cami
    	 * assigna it = nou itinerari
    	 */
    }
    
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
    	return re;
    }
    
}
