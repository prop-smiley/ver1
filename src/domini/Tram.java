package domini;

/**
 *
 * @author alumne
 */
public class Tram extends Edge {
    public Cami c;
    boolean usado = false;

    /**
      * Constructor per defecte.
      * @param nouID integer que indica l ID del nou agent
      */
    public Tram(Vertex source, Vertex destination,int weight) {
	super(source, destination,weight);
	// TODO Auto-generated constructor stub
    }

    /**
     * Funcio get del parametre Usado.
     * @return si esta o no utilitzat el tram objecte.
     */
    public boolean getLliure(){
	return usado;
    }
    
    /**
     * Accio set del parametre Usado.
     * @param b bolean que indica si s ha utilitzat o no.
     */
    public void setLliure(boolean b){
	usado = b;
    }
        	
}
