package domini;

import base.BaseVertex;


/**
 *
 * @author alumne
 */
<<<<<<< HEAD
public class Ciutat extends Vertex{
=======
public class Ciutat extends BaseVertex{
>>>>>>> eb240012d835e306d3288919a15ec49ead3a44ce

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
     * @param longit integer que indica la longitud que sera assignat a la ciutat objecte
     */
    public void setLong(int longitud) {
    	this.longitud = longitud;
    }
    

    /**
     * Funcio get de la longitud de la ciutat objecte.
     */
    public int getLong() {
	return longitud;
    }
    
}
