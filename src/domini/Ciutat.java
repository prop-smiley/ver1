package domini;

import base.BaseVertex;

/**
 *
 * @author alumne
 */
public class Ciutat extends BaseVertex{

    //Dades
    private static int longitud;

    /**
     * Constructor per defecte.
     * @param id integer que indica l ID de la ciutat a crear
     * @param name string que indica el no de la ciutat a crear
     * @param  longitud integer que indica la longitud de la ciutat a crear
     */
    public Ciutat(int id, String name, int longitud) {
	super(id, name);		
	// TODO Auto-generated constructor stub
	this.longitud = longitud;
    }

    /**
     * Accio set de la longitud de la ciutat objecte
     * @param id integer que indica l ID de la ciutat objecte.
     * @param longit integer que indica la longitud que sera assignat a la ciutat objecte
     */
    public void setLong(int longitud) {
    	this.longitud = longitud;
    }
    

    /**
     * Funcio get de la longitud de la ciutat objecte.
     * @param id integer que identifica la ciutat.
     * @return longitud de la ciutat amb identificador id.
     */
    public int getLong(int id) {
	return longitud;
    }
    
}