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
    
    /**
     * Constructor per defecte.
     * @param nouID integer que indica l ID del nou agent
     */
    public Agent(int nouID){
    	this.idAgent = nouID;
    }
    
    /**
     * Accio que assigna una reunio a l agent objecte.
     * @param re Reunio a la que assisteix l agent
     */
    public void assistirReunio(Reunio re){
    	this.re = re;
    }
    
    @Override
    public String toString(){
    	Integer aux = this.idAgent;
    	return aux.toString();
    }
    
    /**
     * Funcio get del parametre ID
     * @return id de l agent objecte.
     */
    public int getId(){
    	return this.idAgent;
    }
    
    /**
     * Funcio get del parametre Itinerari
     * @return Itinerari de l agent objecte.
     */
    public Itinerari getIt(){
    	return this.it;
    }
    
    /**
     * Funcio get del parametre Reunio
     * @return Reunio de l agent objecte.
     */
    public Reunio getRe(){
    	return this.re;
    }
    
    /**
     * Accio set del parametre Itinerari
     * @param cam cami que sera assignat com a itinerari a l agent objecte
     */
    public void setIt(Cami cam){
        Itinerari aux = new Itinerari(idAgent, cam);
    	this.it = aux;
    }
    
    /**
     * Accio set del parametre Reunio
     * @param reun Reunio que sera assignada al Agent objecte
     */
    public void setRe(Reunio reun){
        this.re = reun;
    }
    
}
