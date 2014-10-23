package smiley;

/**
 *
 * @author alumne
 */
public class Agent {
    //Dades
    private static Integer idAgent;
    Itinerari it;
    Reunio r;
    
    public Agent(int nouID){
    	idAgent = nouID;
    }
    
    public static void realitzaItinerari(Cami nouCami){
    	/*
    	 * crea itinerari < subclase de cami
    	 * assigna it = nou itinerari
    	 */
    }
    
    public void assistirReunio(Reunio r){
    	this.r = r;
    }
    
    public String toString(){
    	return idAgent.toString();
    }
    
    
}
