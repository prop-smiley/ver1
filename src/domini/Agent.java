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
    	idAgent = nouID;
    }
    
<<<<<<< HEAD
    /**
     * Accio que assigna una reunio a l agent objecte.
     * @param re Reunio a la que assisteix l agent
=======
    /*
     * Converteix el nouCami en un objecte pertanyent a Itinerari
     * i fa les assignacions necessaries
     */
    public void realitzaItinerari(Itinerari it){
    	this.it = it;
    }
    
    /*
     * Funció per assignar la nova reunió
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
     */
    public void assistirReunio(Reunio re){
    	this.re = re;
    }
    
    @Override
    public String toString(){
    	Integer aux = idAgent;
    	return aux.toString();
    }
<<<<<<< HEAD
    
    /**
     * Funcio get del parametre ID
     * @return id de l agent objecte.
     */
    public int getId(){
=======
        
    public int id(){
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
    	return idAgent;
    }
    
    /**
     * Funcio get del parametre Itinerari
     * @return Itinerari de l agent objecte.
     */
    public Itinerari getIt(){
    	return it;
    }
    
<<<<<<< HEAD
    /**
     * Funcio get del parametre Reunio
     * @return Reunio de l agent objecte.
     */
    public Reunio getRe(){
    	return re;
=======
    public Reunio re(){
    	return this.re;
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce
    }
    
    /**
     * Accio set del parametre Itinerari
     * @param cam cami que sera assignat com a itinerari a l agent objecte
     */
    public void setIt(Itinerari it){
    	this.it = it;
    }
    
    /**
     * Accio set del parametre Reunio
     * @param reun Reunio que sera assignada al Agent objecte
     */
    public void setRe(Reunio reun){
        re = reun;
    }
    
}
