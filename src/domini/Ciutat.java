package domini;



/**
 *
 * @author alumne
 */
public class Ciutat extends Vertex{

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
     * Accio set del Nom de la ciutat objecte.
     * @param id integer que indica l ID de la ciutat objecte.
     * @param name string que indica el nom que sera assignat a la ciutat objecte
     */
    public void setNom(int id, String name) {
        
    }

    /**
     * Accio set de la longitud de la ciutat objecte
     * @param id integer que indica l ID de la ciutat objecte.
     * @param longit integer que indica la longitud que sera assignat a la ciutat objecte
     */
    public void setLong(int id, int longit) {
        
    }
    
    /**
     * Funcio get del Nom de la ciutat objecte.
     * @param id integer que identifica la ciutat.
     * @return nom de la ciutat amb identificador id.
     */
    public String getNom(int id) {
        // return pillar_vertcie.getName(); FALTA VER OPS en VERTICE
        //PARA SACARLA. DE MOMENTO HAY BASURA que sino se queja
        String b = "";
        return b;
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
