package domini;

import base.BaseVertex;


/**
 *
 * @author alumne
 */
public class Ciutat extends BaseVertex{
	//Dades
    private static int longitud;

    //Metodes
    public Ciutat(int id, String name, int longitud) {
		super(id, name);		
		// TODO Auto-generated constructor stub
		this.longitud = longitud;
	}
    
}
